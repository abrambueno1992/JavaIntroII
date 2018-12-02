package com.abrahambueno;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score <= 5000 && score > 1000) {
            System.out.println("Your score was less than or equal to 5000 to a score greater than 1000");

        } else if (score < 1000) {
            System.out.println("Less than 1000");
        } else {
            System.out.println("Greater than 5000");
        }
        calculateScore(gameOver, score, levelCompleted, bonus);

//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        int finalScore = score + (levelCompleted * bonus);
//        System.out.println("Your final score was " + finalScore);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 5000;
//        int levelCompleted = 5;
//        int bonus = 100;
        if (score <= 5000 && score > 1000) {
            System.out.println("Your score was less than or equal to 5000 to a score greater than 1000");

        } else if (score < 1000) {
            System.out.println("Less than 1000");
        } else {
            System.out.println("Greater than 5000");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
