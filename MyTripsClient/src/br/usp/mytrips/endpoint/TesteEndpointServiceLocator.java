/**
 * TesteEndpointServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.mytrips.endpoint;

public class TesteEndpointServiceLocator extends org.apache.axis.client.Service implements br.usp.mytrips.endpoint.TesteEndpointService {

    public TesteEndpointServiceLocator() {
    }


    public TesteEndpointServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TesteEndpointServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TesteEndpointPort
    private java.lang.String TesteEndpointPort_address = "http://localhost:8080/MyTripServer/TesteEndpoint";

    public java.lang.String getTesteEndpointPortAddress() {
        return TesteEndpointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TesteEndpointPortWSDDServiceName = "TesteEndpointPort";

    public java.lang.String getTesteEndpointPortWSDDServiceName() {
        return TesteEndpointPortWSDDServiceName;
    }

    public void setTesteEndpointPortWSDDServiceName(java.lang.String name) {
        TesteEndpointPortWSDDServiceName = name;
    }

    public br.usp.mytrips.endpoint.TesteEndpoint getTesteEndpointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TesteEndpointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTesteEndpointPort(endpoint);
    }

    public br.usp.mytrips.endpoint.TesteEndpoint getTesteEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.usp.mytrips.endpoint.TesteEndpointPortBindingStub _stub = new br.usp.mytrips.endpoint.TesteEndpointPortBindingStub(portAddress, this);
            _stub.setPortName(getTesteEndpointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTesteEndpointPortEndpointAddress(java.lang.String address) {
        TesteEndpointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.usp.mytrips.endpoint.TesteEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
                br.usp.mytrips.endpoint.TesteEndpointPortBindingStub _stub = new br.usp.mytrips.endpoint.TesteEndpointPortBindingStub(new java.net.URL(TesteEndpointPort_address), this);
                _stub.setPortName(getTesteEndpointPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TesteEndpointPort".equals(inputPortName)) {
            return getTesteEndpointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://endpoint.mytrips.usp.br/", "TesteEndpointService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://endpoint.mytrips.usp.br/", "TesteEndpointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TesteEndpointPort".equals(portName)) {
            setTesteEndpointPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
