package com.bellinfo.ioc.xml;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
  /*  private String paymentType;

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
*/
    public void doPaymentStuff(){
        System.out.println("Executing payment service");
    }


}
