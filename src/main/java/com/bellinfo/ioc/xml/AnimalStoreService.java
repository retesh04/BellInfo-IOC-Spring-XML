package com.bellinfo.ioc.xml;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.ProfileValueSourceConfiguration;

@Component
@PropertySource("classpath:application.properties")
public class AnimalStoreService {

    private CatalogService catalogService;

    private PaymentService paymentService;
    
    @Value("${animal.payment.allowed}")
    private String paymentType;

    @Qualifier(value="medicalService")
    @Autowired
    private MedicalService medicalServicesasa3232;

    public AnimalStoreService(@Autowired CatalogService catalogService, @Autowired PaymentService paymentService){
        this.catalogService = catalogService;
        this.paymentService = paymentService;

    }
    
    @PostConstruct
    public void doStuffBefore() {
    	System.out.println("I'm getting called immediately after creating an object. no body need to call me explicitly");
    }

    public void execute(){
    	System.out.println(paymentType);
        catalogService.doCatalogStuff();
        paymentService.doPaymentStuff();
        medicalServicesasa3232.doMedicalStuff();
    }

}
