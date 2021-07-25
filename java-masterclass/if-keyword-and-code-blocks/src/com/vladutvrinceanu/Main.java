package com.vladutvrinceanu;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if(score < 5000 && score>1000){															// for one statement code blocks are optionally, for more than one must be used
//            System.out.println("Your score was 5000 but grater than 1000");
//	    } else if (score < 1000){
//			System.out.println("Your score was less than 1000");
//		}
//		else{
//			System.out.println("Got here");
//		}



		if(gameOver){																				// or if (gameOver == true)
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
//Exercise ( my solution):																			//first wrong solution from him was to create new variables, that uses more ram and process to define new variables
//			score = 10000;																			// my solution is right
//			levelCompleted = 8;
//			bonus = 200;
//			finalScore = score + (levelCompleted * bonus);
//			System.out.println("Your final score was " + finalScore);
			Score(10000, 8, 200);
		}

		//int savedFinalScore = finalScore;                                                         // finalScore variable is only in if statement created and used ->this is called scope

		}

		public static void Score(int a, int b, int c){
    	int finalScore = a + (b *c);
			System.out.println("Your final score was " + finalScore);
    }
}
