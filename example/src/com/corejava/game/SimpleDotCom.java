package com.corejava.game;

public class SimpleDotCom {
    int[] locationCells;
    int num0fHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                num0fHits++;
                break;
            }
        }
        if (num0fHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }


}
