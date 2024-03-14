package com.pfe.MicroServiceC.controller;

import com.pfe.MicroServiceC.service.ServiceBClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ServiceCController {
    private ServiceBClient serviceBClient;
    public ServiceCController(ServiceBClient serviceBClient){
        this.serviceBClient = serviceBClient;
    }
    @GetMapping("call-service-b")
    public String getMessageFromB(){
        String messageFromB = serviceBClient.getMessageFromA();
        return "Service C calling Service B: "+ messageFromB;
    }
}
