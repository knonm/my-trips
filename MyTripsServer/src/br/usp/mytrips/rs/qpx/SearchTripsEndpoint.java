package br.usp.mytrips.rs.qpx;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

import com.google.gson.Gson;

import br.usp.mytrips.rs.qpx.entities.QPXResponse;
import br.usp.mytrips.rs.qpx.request.QPXRequest;

public class SearchTripsEndpoint {

	public static String testSearchTripsEndpoint() {
		WebClient webClient = WebClient.create("https://www.googleapis.com");
        webClient.accept(MediaType.TEXT_PLAIN);
        
        Gson gson = new Gson();
        
        QPXRequest qpxreq = new QPXRequest();
        qpxreq.setMaxPrice("GBP5000");
        
        Response r = webClient.path("qpxExpress/v1/trips/search?key=AIzaSyAm9JhpnhWE0-K3lsqC5m4AB45qJRZCtnA").post(gson.toJson(qpxreq));
        
        
        String jsonString = gson.toJson((String)r.getEntity());
        
        QPXResponse qpxres = gson.fromJson(jsonString, QPXResponse.class);
        
        return qpxres.getTrips().getRequestId();
	}
}
