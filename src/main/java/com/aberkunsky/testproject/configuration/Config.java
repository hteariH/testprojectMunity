package com.aberkunsky.testproject.configuration;

import com.aberkunsky.testproject.encoder.BCryptPasswordEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
/**
 * Created by admin on 6/17/2018.
 */
@Configuration
public class Config {

//    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
