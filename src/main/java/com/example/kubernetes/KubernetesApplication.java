package com.example.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class KubernetesApplication {

  @GetMapping
  public String index() {
    return "this is sample kubernetes application";
  }

  public static void main(String[] args) {
    SpringApplication.run(KubernetesApplication.class, args);
  }

}
