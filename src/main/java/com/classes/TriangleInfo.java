package com.classes;

public class TriangleInfo {
    private float height;
    private float side;
    private float bisector;
    private float area;
    private float perimeter;

    public TriangleInfo(float height, float side, float bisector, float area, float perimeter) {
        this.height = height;
        this.side = side;
        this.bisector = bisector;
        this.area = area;
        this.perimeter = perimeter;
    }

    public TriangleInfo() {
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public float getBisector() {
        return bisector;
    }

    public void setBisector(float bisector) {
        this.bisector = bisector;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }
}
