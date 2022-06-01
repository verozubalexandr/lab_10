package com.classes;

public class PyramidInfo {
    private float side;
    private float apothem;
    private float height;
    private float area;
    private float volume;
    private float baseArea;
    private float baseHeight;

    public PyramidInfo() {
    }

    public PyramidInfo(float side, float apothem, float height, float area, float volume, float baseArea, float baseHeight) {
        this.side = side;
        this.apothem = apothem;
        this.height = height;
        this.area = area;
        this.volume = volume;
        this.baseArea = baseArea;
        this.baseHeight = baseHeight;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public float getApothem() {
        return apothem;
    }

    public void setApothem(float apothem) {
        this.apothem = apothem;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getBaseArea() {
        return baseArea;
    }

    public void setBaseArea(float baseArea) {
        this.baseArea = baseArea;
    }

    public float getBaseHeight() {
        return baseHeight;
    }

    public void setBaseHeight(float baseHeight) {
        this.baseHeight = baseHeight;
    }
}
