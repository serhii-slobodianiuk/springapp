package com.slobodianiuk.springcourse.MusicGenres;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

//    @PostConstruct
//    public void doMyInit() {
//        System.out.println("Doing my initialization classical");
//    }
//
//    @PreDestroy
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction classical");
//    }

    public String getSong() {
        return "Adagio";
    }
}
