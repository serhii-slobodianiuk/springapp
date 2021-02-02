package com.slobodianiuk.springcourse;

import com.slobodianiuk.springcourse.Config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        DeviceDistributor deviceDistributor = context.getBean("deviceDistributor", DeviceDistributor.class);
        deviceDistributor.runDevice();

        context.close();

    }
}

