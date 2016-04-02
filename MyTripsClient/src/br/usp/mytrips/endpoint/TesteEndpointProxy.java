package br.usp.mytrips.endpoint;

public class TesteEndpointProxy implements br.usp.mytrips.endpoint.TesteEndpoint {
  private String _endpoint = null;
  private br.usp.mytrips.endpoint.TesteEndpoint testeEndpoint = null;
  
  public TesteEndpointProxy() {
    _initTesteEndpointProxy();
  }
  
  public TesteEndpointProxy(String endpoint) {
    _endpoint = endpoint;
    _initTesteEndpointProxy();
  }
  
  private void _initTesteEndpointProxy() {
    try {
      testeEndpoint = (new br.usp.mytrips.endpoint.TesteEndpointServiceLocator()).getTesteEndpointPort();
      if (testeEndpoint != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testeEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testeEndpoint)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testeEndpoint != null)
      ((javax.xml.rpc.Stub)testeEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.usp.mytrips.endpoint.TesteEndpoint getTesteEndpoint() {
    if (testeEndpoint == null)
      _initTesteEndpointProxy();
    return testeEndpoint;
  }
  
  public java.lang.String testeString() throws java.rmi.RemoteException{
    if (testeEndpoint == null)
      _initTesteEndpointProxy();
    return testeEndpoint.testeString();
  }
  
  
}