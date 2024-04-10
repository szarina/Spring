package com.example.task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setContextPath("com.example.task2.wsdl");
        return marshaller;
    }

    @Bean
    public SoapClient soapClient(Jaxb2Marshaller marshaller){
        SoapClient client = new SoapClient();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
