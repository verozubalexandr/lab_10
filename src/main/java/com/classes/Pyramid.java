package com.classes;

import java.io.Serializable;

public class Pyramid extends EquilateralTriangle implements Serializable {
    private double apothem;

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem;
    }

    public Pyramid() {
        this.apothem = 0;
        super.triangleSide = 0;
    }

    public Pyramid(double apothem, float side) {
        super.triangleSide = side > 0 ? side : 0;
        this.apothem = apothem > 0 ? apothem : 0;
    }

    @Override
    public double getHeight() {
        return (Math.sqrt((Math.pow(this.apothem, 2)) - (Math.pow((super.getHeight() / 3), 2))));
    }

    public double getBaseHeight() {
        return super.getHeight();
    }

    public double getBaseArea() {
        return super.getArea();
    }

    @Override
    public double getArea() {
        return (super.getArea() + ((getPerimeter() * this.apothem) / 2));
    }

    public double getVolume() {
        return (((getHeight()) * (Math.pow(super.triangleSide, 2))) / (4 * Math.sqrt(3)));
    }

    @Override
    public String toString() {
        return "\tPyramid:"
                + "\n" +
                "apothem -> " + Utils.formatDouble(apothem)
                + "\n" +
                "main side -> " + Utils.formatDouble(super.triangleSide)
                + "\n" +
                "base height -> " + Utils.formatDouble(super.getHeight())
                + "\n" +
                "base area -> " + Utils.formatDouble(super.getArea())
                + "\n" +
                "height -> " + Utils.formatDouble(getHeight())
                + "\n" +
                "area -> " + Utils.formatDouble(getArea())
                + "\n" +
                "volume -> " + Utils.formatDouble(getVolume())
                + "\n\n\n";
    }
}
