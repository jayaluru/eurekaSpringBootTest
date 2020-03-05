package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp
{
    public static void main( String[] args )
    {

        //SpringApplication springApplication = new SpringApplication(EurekaApp.class);
        SpringApplication.run(EurekaApp.class, args);
        System.out.println("Hello World");
    }
}
