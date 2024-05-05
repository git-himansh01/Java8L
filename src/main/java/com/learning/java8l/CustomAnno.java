package com.learning.java8l;

@MyCustomAnnotation(priority=2, tags = {"important", "feature"})
public class CustomAnno {

    public void getInfo(){
        System.out.println("Imp details");
    }
}
