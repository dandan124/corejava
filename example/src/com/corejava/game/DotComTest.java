package com.corejava.game;
/**
 * Games Shooting
 * @author Ricky
 */

import java.util.ArrayList;

public class DotComTest {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int num0fGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        num0fGuesses++;
        String result = "miss";
        for (DotCom dotCom : dotComList) {
            result = dotCom.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless");
        if (num0fGuesses <= 3) {
            System.out.println("It only took you " + num0fGuesses + "guesses");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + num0fGuesses + " guesses ");
            System.out.println("Finish are dancing with your options.");
        }
    }

    public static void main(String[] args) {
        DotComTest game = new DotComTest();
        game.setUpGame();
        game.startPlaying();
    }

}
