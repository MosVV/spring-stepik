package org.zaurtregulov.spring.spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.support.PeriodicTrigger;
import org.springframework.stereotype.Component;

//@Component

public class Dog implements Pet {
    // private String name;
    public Dog() {
        System.out.println("Dog bean created");
    }

    @Override
    public void say() {
        System.out.println(("Bow-Wow"));
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Класс собака: init method");
//
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Класс собака: destroy method");
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
