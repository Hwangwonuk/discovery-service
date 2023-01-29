package com.example.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer
 * Eureka가 서버 역할을 하기위해서는 서버의 자격으로 등록해야한다
 * 그 작업을 해주는것이 @EnableEurekaServer 어노테이션이다.
 * 즉, Service Discovery로써 어플리케이션을 기동한다 라는 뜻이다.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(DiscoveryserviceApplication.class, args);
  }

}
