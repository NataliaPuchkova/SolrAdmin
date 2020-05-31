package alfa.house.SolrAdmin.service;

import alfa.house.SolrAdmin.SolrAdminApplication;
import alfa.house.SolrAdmin.model.Request;
import alfa.house.SolrAdmin.model.ResponseUpdate;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class SolrAdminServiceImpl implements SolrAdminService {

    @Autowired
    RestTemplate restTemplate;

    SolrClient solrClient;

    private static final Logger log = (Logger) LoggerFactory.getLogger(SolrAdminServiceImpl.class);


    @Override
    public void sendRequest(Request req, String solrUrl) {
        HttpEntity<Request> request = new HttpEntity<>(req);
        //ResponseUpdate response = restTemplate.postForObject(solrUrl, request, ResponseUpdate.class);
        String response = restTemplate.postForObject(solrUrl, request, String.class);
        log.info(response.toString());
    }

    @Override
    public void deleteById(String id, String solrUrl)  {
        SolrClient client = getSolrClient(solrUrl);
       try {
           client.deleteById(id);
           client.commit();

           log.info("Solr document is deleted: {}", id);
       }catch(Exception e){
           log.info("Solr document was not deleted: {}, reason:{}", id, e.getMessage());
       }
    }

    private SolrClient getSolrClient(String solrUrl){
        if (solrClient ==null) {
            solrClient = new HttpSolrClient.Builder(solrUrl)
                .withConnectionTimeout(10000)
                 .withSocketTimeout(60000)
                .build();
        }
        return solrClient;


    }


}
