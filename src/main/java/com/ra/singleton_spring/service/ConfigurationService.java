package com.ra.singleton_spring.service;


import com.ra.singleton_spring.model.SingletonExample;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConfigurationService {
    
    private final SingletonExample singletonExample;

    public String getConfiguration() {
        return singletonExample.getConfig();
    }

}
