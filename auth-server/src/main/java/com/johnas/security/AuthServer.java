package com.johnas.security;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AuthServer {

  @RequestMapping("/user")
  public Principal user(Principal user) {
    return user;
  }

  public static void main(String[] args) {
    SpringApplication.run(AuthServer.class, args);
  }

}
