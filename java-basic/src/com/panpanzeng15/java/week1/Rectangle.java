package com.panpanzeng15.java.week1;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author 南风有你
 * @Date 2020/10/10
 **/
public class Rectangle {
    double x, y, width, height;
    public void setX(double a){
        x = a;
    }
    public double getX(){
        return x;
    }
    public void setY(double b){
        y = b;
    }
    public double getY(){
        return y;
    }
    public void setWidth(double w){
        if(w > 0)
            width = w;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double h){
        if(height > 0)
            height = h;
    }
    public double getHight(){
        return height;
    }
}
