package com.johnas.security;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ResourceApplicationServer extends WebSecurityConfigurerAdapter {

  @RequestMapping("/")
  public Message home() {
    return new Message("Hello World");
  }

  public static void main(String[] args) {
    SpringApplication.run(ResourceApplicationServer.class, args);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.httpBasic().disable();
    http.authorizeRequests().anyRequest().authenticated();
  }

  class Message {
    private String id = UUID.randomUUID().toString();
    private String content;

    Message() {
    }

    public Message(String content) {
      this.content = content;
    }

    public String getId() {
      return id;
    }

    public String getContent() {
      return content;
    }
  }
}

//@SpringBootApplication
//@RestController
//@EnableResourceServer
//public class ResourceApplicationServer {
//
//  @RequestMapping("/")
//  public Message home() {
//    return new Message("Hello World");
//  }
//
//  public static void main(String[] args) {
//    SpringApplication.run(ResourceApplicationServer.class, args);
//  }
//
//  class Message {
//    private String id = UUID.randomUUID().toString();
//    private String content;
//
//    Message() {
//    }
//
//    public Message(String content) {
//      this.content = content;
//    }
//
//    public String getId() {
//      return id;
//    }
//
//    public String getContent() {
//      return content;
//    }
//  }
//}
