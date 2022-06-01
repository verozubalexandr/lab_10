package com.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PyramidsDatabase implements Serializable {
    private List<Pyramid> pyramidsList;

    public PyramidsDatabase() {
        pyramidsList = new ArrayList<Pyramid>();
    }

    public boolean add(Pyramid pyramid) {
        return pyramidsList.add(pyramid);
    }

    public Pyramid getPyramidFromList(int index) {
        return pyramidsList.get(index);
    }

    public List<Pyramid> getPyramidList() {
        return pyramidsList;
    }

    public double getLargestVolume() {
        double largestVolume = this.pyramidsList.get(0).getVolume();
        for (int i = 1; i < pyramidsList.size(); i++) {
            if (largestVolume < pyramidsList.get(i).getVolume()) {
                largestVolume = pyramidsList.get(i).getVolume();
            }
        }
        return largestVolume;
    }

    public void clear() {
        this.pyramidsList.clear();
    }

    @Override
    public String toString() {
        return "largest volume -> " + Utils.formatDouble(getLargestVolume()) +
                "\n\n\n";
    }
}
