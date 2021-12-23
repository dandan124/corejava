package com.corejava.game;

public class GameTest {
    public static void main(String[] args) {
        int num0fGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            num0fGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + num0fGuesses + "guesses");
            }
        }
    }
}
