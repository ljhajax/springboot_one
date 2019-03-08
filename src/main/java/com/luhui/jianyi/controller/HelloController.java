package com.luhui.jianyi.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class HelloController extends SpringBootServletInitializer{
 
@RequestMapping("hello")
String hello() {
return "Hello World!";
}
 
public static void main(String[] args) {
SpringApplication.run(HelloController.class, args);
}
}
