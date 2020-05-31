package alfa.house.SolrAdmin.service;

import alfa.house.SolrAdmin.model.Request;

public interface SolrAdminService {
   void sendRequest(Request request, String url);
   void deleteById(String id, String url);
}
