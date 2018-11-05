package com.bittech.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: secondriver
 * Created: 2018/10/31
 */
@Configuration
public class AnnotationConfiguration {
    
    @Bean
    public String hello() {
        return "hello";
    }
    
    @Bean(name = "pointMap")
    public Map<String, String> javaEEPoint() {
        Map<String, String> points = new HashMap<String, String>();
        points.put("1", "mybatis");
        points.put("2", "spring core");
        points.put("3", "spring mvc");
        points.put("4", "spring boot");
        return points;
    }
    
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
        
        
        String hello = (String) applicationContext.getBean("hello");
        System.out.println(hello);
        
        Map<String, String> pointMap = (Map<String, String>) applicationContext.getBean("pointMap");
        System.out.println(pointMap);
        
    }
    
}
