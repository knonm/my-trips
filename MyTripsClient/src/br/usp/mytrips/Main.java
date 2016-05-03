package br.usp.mytrips;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.usp.mytrips.endpoint.TesteEndpoint;

public class Main {

	public static void main(String[] args) {
		
		URL url = null;
		try {
			url = new URL("http://localhost:8080/MyTripServer/TesteEndpoint?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://impl.endpoint.mytrips.usp.br/", "TesteEndpointImplService");

        Service service = Service.create(url, qname);

        TesteEndpoint tst = service.getPort(TesteEndpoint.class);

        System.out.println(tst.testeString());
	}
}