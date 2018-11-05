package com.bittech.springcore.shape;

/**
 * Author: secondriver
 * Created: 2018/10/31
 */
public class Rectangle implements Shape {
    
    private final double width;
    
    private final double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double computeArea() {
        return this.width * this.height;
    }
    
    public double computeSide() {
        return 2 * (this.width + this.height);
    }
    
    @Override
    public String toString() {
        return String.format("Rectangle (width,height) = (%f,%f)    , area = %f  , side = %f",
                this.width,
                this.height,
                this.computeArea(),
                this.computeSide());
    }
}
