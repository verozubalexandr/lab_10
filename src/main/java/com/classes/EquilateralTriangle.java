package com.classes;

import java.io.Serializable;

public class EquilateralTriangle implements Serializable {
    protected float triangleSide;

    public EquilateralTriangle() {
        this.triangleSide = 0;
    }

    public EquilateralTriangle(float triangleSide) {
        this.triangleSide = triangleSide > 0 ? triangleSide : 0;
    }

    public float getTriangleSide() {
        return triangleSide;
    }

    public void setTriangleSide(float triangleSide) {
        this.triangleSide = triangleSide > 0 ? triangleSide : 0;
    }

    public double getPerimeter() {
        return this.triangleSide * 3;
    }

    public double getArea() {
        return (((Math.sqrt(3)) / 4) * ((this.triangleSide) * (this.triangleSide)));
    }

    public double getHeight() {
        return (((Math.sqrt(3)) / 2) * (this.triangleSide));
    }

    public double getBisector() {
        return getHeight();
    }

    @Override
    public String toString() {
        return "\tTriangle:"
                + "\n" +
                "triangle side -> " + Utils.formatDouble(triangleSide)
                + "\n" +
                "triangle perimeter -> " + Utils.formatDouble(getPerimeter())
                + "\n" +
                "triangle area -> " + Utils.formatDouble(getArea())
                + "\n" +
                "triangle height -> " + Utils.formatDouble(getHeight())
                + "\n" +
                "triangle bisector -> " + Utils.formatDouble(getBisector())
                + "\n\n\n";
    }
}
