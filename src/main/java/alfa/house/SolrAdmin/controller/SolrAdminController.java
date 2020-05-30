package alfa.house.SolrAdmin.controller;

import alfa.house.SolrAdmin.model.Request;
import alfa.house.SolrAdmin.service.SolrAdminServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Task Controller", description = "Operation with atalog search")
public class SolrAdminController {

    @Value("${solrUrl}")
    private String solrUrl;

    @Autowired
    SolrAdminServiceImpl service;

    @GetMapping(value = "/hello")
    public String getHello(){
        return "Hello world!";
    }

    @PostMapping(value = "/new", consumes = "application/json", produces = "text/plain")
    public String sendSolrUpdate(@RequestBody Request request){
        service.sendRequest(request, solrUrl);
        return "Ok";
    }
}
