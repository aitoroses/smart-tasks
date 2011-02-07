
/*
 * 
 */

package org.example.ws_ht.api.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.9
 * Mon Feb 07 20:30:48 ART 2011
 * Generated source version: 2.2.9
 * 
 */


@WebServiceClient(name = "taskOperations", 
                  wsdlLocation = "file:/home/esteban/plugTree/smart-tasks/smart-tasks-model/src/main/resources/wsdl/ws-humantask.wsdl",
                  targetNamespace = "http://www.example.org/WS-HT/api/wsdl") 
public class TaskOperations_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.example.org/WS-HT/api/wsdl", "taskOperations");
    public final static QName TaskOperationsSOAP = new QName("http://www.example.org/WS-HT/api/wsdl", "taskOperationsSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/esteban/plugTree/smart-tasks/smart-tasks-model/src/main/resources/wsdl/ws-humantask.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/home/esteban/plugTree/smart-tasks/smart-tasks-model/src/main/resources/wsdl/ws-humantask.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public TaskOperations_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TaskOperations_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaskOperations_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns TaskOperations
     */
    @WebEndpoint(name = "taskOperationsSOAP")
    public TaskOperations getTaskOperationsSOAP() {
        return super.getPort(TaskOperationsSOAP, TaskOperations.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TaskOperations
     */
    @WebEndpoint(name = "taskOperationsSOAP")
    public TaskOperations getTaskOperationsSOAP(WebServiceFeature... features) {
        return super.getPort(TaskOperationsSOAP, TaskOperations.class, features);
    }

}
