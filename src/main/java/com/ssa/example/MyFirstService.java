package com.ssa.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {
    final private MyFirstClass myFirstClass;
    @Value("${my.name}")
    private String name;
    @Value("${my.num.int}")
    private Integer num;
    @Value("${my.custom.name}")
    private String customName;
    @Autowired
    public MyFirstService(
        @Qualifier("myFirstClass") MyFirstClass myFirstClass
    ) {
        this.myFirstClass = myFirstClass;
    }

    public String  tellAStory(){
        return "dependency is saying "+ myFirstClass.sayHello();
    }

    public String getName() {
        return name;
    }

    public String getCustomName() {
        return customName;
    }

    public Integer getNum() {
        return num;
    }
}
