package com.meetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.meetup"})
@EnableSwagger2
public class MeetupApplication {

  public static void main(final String[] args) {
    SpringApplication.run(MeetupApplication.class, args);
  }
}
