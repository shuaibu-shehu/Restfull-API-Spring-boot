package com.ssa.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class ApplicationConfig {
    @Bean
    public MyFirstClass myFirstClass(){
        return new MyFirstClass("first bean");
    }
    @Bean
    @Qualifier("bean2")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("second bean");
    }
}
