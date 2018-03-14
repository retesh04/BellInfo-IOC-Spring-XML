package com.bellinfo.ioc.xml;

import org.springframework.stereotype.Component;

@Component
public class CatalogService {
 /*   private String catalogName;

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
*/
    public void doCatalogStuff(){
       System.out.println("Executing catalog service");
    }

}
