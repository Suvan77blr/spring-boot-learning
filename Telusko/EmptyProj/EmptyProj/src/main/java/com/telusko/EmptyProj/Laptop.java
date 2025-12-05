package com.telusko.EmptyProj;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary      // Primary Annotation.

public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("Program is compiling ... ");
    }
}
