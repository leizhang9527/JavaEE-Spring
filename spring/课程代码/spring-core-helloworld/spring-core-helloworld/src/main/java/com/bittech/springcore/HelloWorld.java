package com.bittech.springcore;

/**
 * Author: secondriver
 * Created: 2018/10/31
 */
public class HelloWorld {
    
    private String name;
    
    public void greeting() {
        System.out.println("Hello " + name + " !");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
