package com.bittech.springcore.assemble;

import java.beans.ConstructorProperties;

/**
 * Author: secondriver
 * Created: 2018/10/31
 */
public class Foo {
    
    private Bar bar;
    
    private Baz baz;
    
    public Foo(Bar bar, Baz baz) {
        this.bar = bar;
        this.baz = baz;
    }
    
    @Override
    public String toString() {
        return "Foo{" +
                "bar=" + bar +
                ", baz=" + baz +
                '}';
    }
}
