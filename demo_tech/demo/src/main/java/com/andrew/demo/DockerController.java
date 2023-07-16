package com.andrew.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/andrew/docker")
public class DockerController {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> helloDocker(){
        return ResponseEntity.ok("DEMO HELLO DOCKER");
    }
}
