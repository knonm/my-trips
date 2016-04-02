package br.usp.mytrips;

import java.rmi.RemoteException;

import br.usp.mytrips.endpoint.TesteEndpointProxy;

public class Main {

	public static void main(String[] args) {
		
		TesteEndpointProxy proxy = new TesteEndpointProxy();
		try {
			System.out.println(proxy.testeString());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
