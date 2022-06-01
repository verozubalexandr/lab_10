package com.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrianglesDatabase implements Serializable {
    private List<EquilateralTriangle> equilateralTrianglesList;

    public TrianglesDatabase() {
        equilateralTrianglesList = new ArrayList<EquilateralTriangle>();
    }

    public boolean add(EquilateralTriangle equilateralTriangle) {
        return equilateralTrianglesList.add(equilateralTriangle);
    }

    public double getAverageArea() {
        double averageArea = 0;
        for (EquilateralTriangle equilateralTriangle : equilateralTrianglesList) {
            averageArea += equilateralTriangle.getArea();
        }
        return averageArea / (equilateralTrianglesList.size());
    }

    public TrianglesDatabase countMoreThanAverage() {
        TrianglesDatabase result = new TrianglesDatabase();
        double average = getAverageArea();
        for (EquilateralTriangle equilateralTriangle : equilateralTrianglesList) {
            if (equilateralTriangle.getArea() > average) {
                result.add(equilateralTriangle);
            }
        }
        return result;
    }

    public EquilateralTriangle getEquilateralTriangleFromList(int index) {
        return equilateralTrianglesList.get(index);
    }

    public List<EquilateralTriangle> getEquilateralTrianglesList() {
        return equilateralTrianglesList;
    }

    public void clear() {
        this.equilateralTrianglesList.clear();
    }

    @Override
    public String toString() {
        return "average area -> " + Utils.formatDouble(getAverageArea())
                + "\n" +
                "more than average count -> " + countMoreThanAverage().getEquilateralTrianglesList().size()
                + "\n\n";
    }
}
