package com.bittech.springcore.shape;

/**
 * Author: secondriver
 * Created: 2018/10/31
 */
public class Circular implements Shape {
    
    private final double radius;
    
    public Circular(double radius) {
        this.radius = radius;
    }
    
    public double computeArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    public double computeSide() {
        return 2 * Math.PI * this.radius;
    }
    
    @Override
    public String toString() {
        return String.format("Circular radius = %f  , area = %f  , side = %f",
                this.radius,
                this.computeArea(),
                this.computeSide());
    }
}
