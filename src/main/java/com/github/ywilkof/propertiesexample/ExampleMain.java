package com.github.ywilkof.propertiesexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import java.lang.*;
import java.util.Arrays;

@SpringBootApplication
public class ExampleMain {

    @Autowired
    private SystemProperties system;

    public static void main(String[] args) throws Exception {
        final ConfigurableApplicationContext application = SpringApplication.run(ExampleMain.class, args);
        final Environment e = application.getEnvironment();
    }

    @PostConstruct
    public void init() {
        System.out.println(Arrays.toString(system.getLocators().toArray()));
    }

}
