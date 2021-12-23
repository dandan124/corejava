package com.corejava.game;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

    // TODO: all the following code was added and should have been included in the book
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
