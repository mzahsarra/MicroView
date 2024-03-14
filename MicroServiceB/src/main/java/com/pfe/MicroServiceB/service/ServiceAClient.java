package com.pfe.MicroServiceB.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name = "serviceA", url = "${serviceA.url}")
public interface ServiceAClient {
    @GetMapping("/hello")
    String hello();
}
