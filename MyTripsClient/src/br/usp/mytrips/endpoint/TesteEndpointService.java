/**
 * TesteEndpointService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.mytrips.endpoint;

public interface TesteEndpointService extends javax.xml.rpc.Service {
    public java.lang.String getTesteEndpointPortAddress();

    public br.usp.mytrips.endpoint.TesteEndpoint getTesteEndpointPort() throws javax.xml.rpc.ServiceException;

    public br.usp.mytrips.endpoint.TesteEndpoint getTesteEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
