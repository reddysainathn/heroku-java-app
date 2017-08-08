package com.example;

import com.fasterxml.jackson.databind.node.TextNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloSpringBootApplication {

    @RequestMapping("/")
    @ResponseBody
    String sayHello() {
        return "<h1>Under Construction</h1>";
    }

    // @RequestMapping(method = RequestMethod.POST, path = {"/no", "/noHello"})
    // @ResponseBody
    // ResponseEntity<String> sayNoHello(@RequestBody String name) {
    //     return ResponseEntity.status(HttpStatus.ACCEPTED).body(name);
    // }

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootApplication.class, args);
    }

}
