package com.pfe.MicroServiceC.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceB", url = "${serviceB.url}")
public interface ServiceBClient {
    @GetMapping("/call-service-a")
    String getMessageFromA();
}