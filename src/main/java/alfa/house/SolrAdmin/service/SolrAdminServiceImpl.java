package alfa.house.SolrAdmin.service;

import alfa.house.SolrAdmin.SolrAdminApplication;
import alfa.house.SolrAdmin.model.Request;
import alfa.house.SolrAdmin.model.ResponseUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SolrAdminServiceImpl implements SolrAdminService {

    @Autowired
    RestTemplate restTemplate;

    private static final Logger log = (Logger) LoggerFactory.getLogger(SolrAdminServiceImpl.class);


    @Override
    public void sendRequest(Request req, String solrUrl) {
        HttpEntity<Request> request = new HttpEntity<>(req);
        //ResponseUpdate response = restTemplate.postForObject(solrUrl, request, ResponseUpdate.class);
        String response = restTemplate.postForObject(solrUrl, request, String.class);
        log.info(response.toString());
    }
}
