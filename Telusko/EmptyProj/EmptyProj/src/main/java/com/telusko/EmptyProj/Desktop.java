package com.telusko.EmptyProj;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    // Promary-annotation.
public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Program is compiling faster ... ");
    }
}
