package com.practice.infinityprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InfinityPracApplication {

  public static void main(String[] args) {
    SpringApplication.run(InfinityPracApplication.class, args);
  }
}
