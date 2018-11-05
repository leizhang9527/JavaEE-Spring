package com.bittech.springcore.shape;

/**
 * Author: secondriver
 * Created: 2018/10/31
 */
public class XmlShapeCompute {
    
    private Shape shape;
    
    public Shape getShape() {
        return shape;
    }
    
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    
    public String getShapeComputeInfo() {
        return this.shape.toString();
    }
}
