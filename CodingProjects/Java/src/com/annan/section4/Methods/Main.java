package com.annan.section4.Methods;

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

        int playerHighScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Annan", playerHighScore);

        playerHighScore = calculateHighScorePosition(900);
        displayHighScorePosition("Rashi", playerHighScore);

        playerHighScore = calculateHighScorePosition(400);
        displayHighScorePosition("Manish", playerHighScore);

        playerHighScore = calculateHighScorePosition(50);
        displayHighScorePosition("Anaisha", playerHighScore);
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println( playerName + " managed to get into position " + playerPosition + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4; // assuming position 4 will be returned
        
        if(playerScore >=1000)
            position = 1;
        else if(playerScore >=500)
            position = 2;
        else if(playerScore >=100)
            position = 3;
        return position;

    }
}
