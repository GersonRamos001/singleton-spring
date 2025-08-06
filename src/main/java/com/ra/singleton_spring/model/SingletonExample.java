package com.ra.singleton_spring.model;

import org.springframework.stereotype.Component;

@Component
public class SingletonExample {
    private static volatile SingletonExample instance;
    private final String config;

    private SingletonExample(){
        this.config = loadConfig();
    }

    public static SingletonExample getInstance() {
        if (instance == null){
            synchronized (SingletonExample.class){
                if (instance == null){
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    private String loadConfig() {
        // Simulate loading configuration
        return "Configuration Loaded";
    }

    public String getConfig() {
        return config;
    }
}
