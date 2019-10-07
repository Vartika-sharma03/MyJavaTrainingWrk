package add;

public class AddProxy implements add.Add {
  private String _endpoint = null;
  private add.Add add = null;
  
  public AddProxy() {
    _initAddProxy();
  }
  
  public AddProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddProxy();
  }
  
  private void _initAddProxy() {
    try {
      add = (new add.AddServiceLocator()).getAdd();
      if (add != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)add)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)add)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (add != null)
      ((javax.xml.rpc.Stub)add)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public add.Add getAdd() {
    if (add == null)
      _initAddProxy();
    return add;
  }
  
  public int addition(int x, int y) throws java.rmi.RemoteException{
    if (add == null)
      _initAddProxy();
    return add.addition(x, y);
  }
  
  
}