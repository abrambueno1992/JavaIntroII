package com.abrahambueno;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Abraham", 30);
        int calculatedResult = calculateHighScorePosition(1500);
        System.out.println("Result is = " + calculatedResult);

        calculatedResult = calculateHighScorePosition(900);
        System.out.println("Result is = " + calculatedResult);

        calculatedResult = calculateHighScorePosition(400);
        System.out.println("Result is = " + calculatedResult);

        calculatedResult = calculateHighScorePosition(50);
        System.out.println("Result is = " + calculatedResult);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return  finalScore;
        } else {
            return -1;
        }
    }

    public  static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public  static  int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (500 <= score) {
            return 2;
        } else if (100 <= score) {
            return 3;
        } else {
            return 4;
        }
    }

}
