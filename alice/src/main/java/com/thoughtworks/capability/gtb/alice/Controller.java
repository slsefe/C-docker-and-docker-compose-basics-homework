package com.thoughtworks.capability.gtb.alice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        RestTemplate template = new RestTemplate();
        String s = "http://app-bob:8081/hello";
        URI uri = URI.create(s);
        ResponseEntity<String> response = template.getForEntity(uri, String.class);
        return response.getBody();
    }
}
