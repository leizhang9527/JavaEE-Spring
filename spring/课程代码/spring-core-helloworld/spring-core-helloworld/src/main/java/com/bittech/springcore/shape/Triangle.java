package com.bittech.springcore.shape;

import java.util.Arrays;

/**
 * Author: secondriver
 * Created: 2018/10/31
 */
public class Triangle implements Shape {
    
    private final double a;
    
    private final double b;
    
    private final double c;
    
    public Triangle(double a, double b, double c) {
        double[] values = new double[]{a, b, c};
        Arrays.sort(values);
        if (
                (values[0] + values[1] > values[2])
                        &&
                        (values[2] - values[0] < values[1])) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("side must be triangle ");
        }
    }
    
    /**
     * 海伦公式
     * <p>
     * p  = (a+b+c)/2
     * s  = sqrt((p-a)(p-b)(p-c)*p)
     */
    public double computeArea() {
        double p = this.computeSide() / 2;
        return Math.sqrt((p - this.a) * (p - this.b) * (p - this.c) * p);
    }
    
    public double computeSide() {
        return this.a + this.b + this.c;
    }
    
    @Override
    public String toString() {
        
        return String.format("Triangle (a,b,c) =(%f,%f,%f) , area = %f  , side = %f",
                this.a,
                this.b,
                this.c,
                this.computeArea(),
                this.computeSide());
    }
}
