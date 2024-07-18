package com.ssa.example;

import org.springframework.stereotype.Component;

@Component
public class MyFirstClass {
    String  var;

    public MyFirstClass(String var) {
        this.var = var;
    }

    public String sayHello(){
        return  "hello world, var ==> " + var;
    }
}
