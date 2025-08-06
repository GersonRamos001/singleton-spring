package com.ra.singleton_spring.controler;


import com.ra.singleton_spring.service.ConfigurationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {

    private final ConfigurationService configurationService;

    @RequestMapping("/config")
    public String getConfig() {
        return configurationService.getConfiguration();
    }
}
