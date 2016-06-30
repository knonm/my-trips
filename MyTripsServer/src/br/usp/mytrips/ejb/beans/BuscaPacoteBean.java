package br.usp.mytrips.ejb.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;

import br.usp.mytrips.ejb.beans.interfaces.BuscaPacote;
import br.usp.mytrips.rs.qpx.entities.QPXResponse;
import br.usp.mytrips.rs.qpx.request.QPXRequest;

@Stateless
@LocalBean
public class BuscaPacoteBean implements BuscaPacote {

	public QPXResponse buscaPacote(QPXRequest qpxreq) {
		try {
			
			Gson gson = new Gson();
	        
			// create HTTP Client
			HttpClient httpClient = HttpClientBuilder.create().build();
 
			// Create new getRequest with below mentioned URL
			HttpPost getRequest = new HttpPost("https://www.googleapis.com/qpxExpress/v1/trips/search?key=AIzaSyAm9JhpnhWE0-K3lsqC5m4AB45qJRZCtnA");
 
			// Add additional header to getRequest which accepts application/xml data
			getRequest.addHeader("accept", "application/json");
 
			StringEntity requestEntity = new StringEntity(
					gson.toJson(qpxreq),
				    ContentType.APPLICATION_JSON);
			
			getRequest.setEntity(requestEntity);
			
			// Execute your request and catch response
			HttpResponse response = httpClient.execute(getRequest);
 
			// Check for HTTP response code: 200 = success
			if (response.getStatusLine().getStatusCode() != 200) {
				//throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}
 
			// Get-Capture Complete application/xml body response
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
			String output;
			String outputFinal = "";
			//System.out.println("============Output:============");
 
			// Simply iterate through XML response and show on console.
			while ((output = br.readLine()) != null) {
				outputFinal += output;
			}
			
			//return gson.toJson(qpxreq);
			
			QPXResponse qpxres = gson.fromJson(outputFinal, QPXResponse.class);
			
			return qpxres;
 
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
