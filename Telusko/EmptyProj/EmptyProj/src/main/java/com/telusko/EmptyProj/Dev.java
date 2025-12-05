package com.telusko.EmptyProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Field Injection.                     // Injection Method 1.
//    @Autowired
    private Computer comp;

    // Constructor Injection.               // Injection Method 2.
//    public Dev(Computer comp) {
//        this.comp = comp;
//    }

    // Setter Injection.                    // Injection Method 3.
    @Autowired
//    @Qualifier("laptop")
    public void setComputer(Computer comp) {
        this.comp = comp;
    }

    public String greetUser() {
        return "Hai user!";
    }

    public void build() {
        System.out.println("Build has been initiated ..");
        comp.compile();
    }

}
