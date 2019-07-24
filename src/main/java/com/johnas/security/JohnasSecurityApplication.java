package com.johnas.security;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JohnasSecurityApplication {

  @RequestMapping("/resource")
  public Map<String, Object> home() {
    Map<String, Object> model = new HashMap<>();
    model.put("id", UUID.randomUUID().toString());
    model.put("content", "yo ziom");
    return model;
  }

  public static void main(String[] args) {
    SpringApplication.run(JohnasSecurityApplication.class, args);
  }

  @Configuration
  public static class BasicWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http
        .httpBasic();

      http.authorizeRequests().anyRequest().authenticated();
    }
  }

}
