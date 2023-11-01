package codingChallenge2;
import java.util.Scanner;
public class ScrabbleDriver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Player 1, enter a word: ");
		String player1Ans = input.nextLine();
		
		System.out.println("Player 2, enter a word: ");
		String player2Ans = input.nextLine();
		//assigning variables for the points
		int pointsPlayer1 = 0;
		int pointsPlayer2= 0;
		
		input.close();
		
		for (char letter: player1Ans.toCharArray() ) {
			pointsPlayer1 += ScrabbleNum(letter);
			
		}
		
		for (char letter: player2Ans.toCharArray()) {
			pointsPlayer2 += ScrabbleNum(letter);
			
		}
		
		//if statement if player1 has more points than player2
		if (pointsPlayer1 > pointsPlayer2) {
			System.out.println("player 1 wins");
		}
		
		//if statement if player2 has more points than player1
		if (pointsPlayer2 > pointsPlayer1) {
			System.out.println("player 2 wins");
		}
		
		//tie
		if (pointsPlayer2 == pointsPlayer1) {
			System.out.println("tie");
		}
	}
		
	//method for assigning numbers to letters
	private static int ScrabbleNum(char letter) {
		switch(letter) {
		case 'a','e','i','l','n','o','r','s','t','u':
		 return 1;
		case 'd','g':
			return 2;
		case 'b','c','m','p':
			return 3;
		case 'f','h','y':
			return 4;
		case 'k':
			return 5;
		case 'j','x':
			return 8;
		case 'q','z':
			return 10;
		}
		return 0;
		
		
	}
	
}

