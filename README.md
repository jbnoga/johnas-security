# JohnasSecurity

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 6.2.8.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

## Spring Boot 2 security release notes  

https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-Security-2.0

## Tutorial for spring security and angular 2+ -> `https://spring.io/guides/tutorials/spring-security-and-angular-js/`

# CORS

https://en.wikipedia.org/wiki/Cross-origin_resource_sharing
https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS

# Basic Authentication

When server sends the '401 Unauthorized' status code with the `www-authenticate: Basic realm=Realm` header 
then the Browser pops up a Browser authentication dialogue in order to provide credentials
Once you enter the username and the password a browser will send them encrypted 
inside of the `authorization: Basic dXNlcjpwYXNzd29yZA==` header.

setup:
` 
http.httpBasic();
http.authorizeRequests().anyRequest().authenticated();
`

# Login Form
 
