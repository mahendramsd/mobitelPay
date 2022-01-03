package com.cmg.mobitelPay.config;

import com.cmg.mobitelPay.client.MobitelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.cmg.mobitelPay.wsdl");
        return marshaller;
    }

    @Bean
    public MobitelClient countryClient(Jaxb2Marshaller marshaller) {
        MobitelClient client = new MobitelClient();
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
