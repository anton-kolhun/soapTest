package com.kolhun.service;

import com.kolhun.generated.server.HelloWebServiceImplService;
import com.kolhun.generated.server.HelloWebservice;
import com.kolhun.helper.GreetingHelper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.namespace.QName;
import java.net.URL;

/**
 * Created by akolhun on 08.10.2015.
 */
public class HelloWebServiceImpl implements com.kolhun.generated.server.HelloWebservice {

    @Autowired
    private GreetingHelper helper;


    @Override
    public String sayBye(String name) {
        return "bye";
    }

    @Override
    public String sayHello(String name) {
        try {

         /*   HelloWebservice service = new HelloWebServiceImplService(new URL("http://localhost:8084/services/greeting?wsdl"),
                    new QName("http://service.kolhun.com/", "HelloWebServiceImplService"))
                    .getHelloWebServiceImplPort();
            service.sayHello("ds");*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "xz";
    }
}
