package com.vladutvrinceanu;

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

		// procedure a method type void

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Vladut", highScorePosition);

		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Ruxandra", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Iustin", highScorePosition);

		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Mama", highScorePosition);

/*	    if(gameOver) {
	        int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }*/


/*	    int a = 2>1? 1:0;														// remember
        System.out.println(a);*/


        /* primitive data types:
        int = 32 biti (4 bytes)
        long = 64 biti (8 bytes)
        short = 16 biti ( 2 bytes)
        byte = 8 biti ( un byte)
        float = 32 biti (4 bytes)
        double = 64 biti (4 bytes)
        one char = 16 biti ( 2 bytes)
		float = 32 biti (4 bytes) 7 cifre dupa .
		double = 64 biti (8 bytes) 16 cifre dupa .



         */
	}

/*    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {                     // void don't return anything; for returning info data type should be use instead of void
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;}
																										// error if finalSore is set just for gameOver true, we need to make sure that is returned everytime
		else
			return -1;   }         */                                                                       // one way

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {                     // void don't return anything; for returning info data type should be use instead of void
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;}
		// error if finalSore is set just for gameOver true, we need to make sure that is returned everytime
		return -1;                                                                                   				// second way   once return is made then function is stopped because something was already returned.

	}

	public static void displayHighScorePosition(String name, int position) {
		System.out.println(name + " managed to get into position "
				+ position + " on the high score table.");
	}

	public static int calculateHighScorePosition(int score) {
/*		if(score >= 1000){
			return 1;}
//		else if (score < 1000 && score >= 500){					// score < 1000 is always true, we verified that in first if with score>=1000
		else if (score >= 500){
			return 2;
		}
//		else if (score >= 100 && score < 500) {					// score < 500 is always true, we verified that in first if with >=500
		else if (score >= 100) {
			return 3;
		}
		return 4;*/

		int position = 4;											// assuming position 4 will be returned

		if(score >= 1000) {
			position = 1;
		}
		else if (score>=500){
			position = 2;
		}
		else if (score>=100){
			position = 3;
		}
		return position;

	}
}
