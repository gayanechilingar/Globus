/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weather.globus;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *
 * @author gayanec
 */


@SpringBootApplication
@EnableMongoRepositories("com.weather.globus.repositories")
@ComponentScan("com.weather.globus")
@EntityScan("com.weather.globus.weather.domain")
@EnableAsync
public class GlobusApplication {

    public static void main(String[] args) {                  
        final SpringApplication application = new SpringApplication(GlobusApplication.class);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args).getEnvironment();
    }
    
}





