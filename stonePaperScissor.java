package stonePaperScissor;
import java.util.Scanner;
import java.util.Random;

public class StonePaperScissor {
	
	//1 for stone
	//2 for paper 
	//3 for scissor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Choose '1' for stone , '2' for paper , '3' for scissor.. ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbre of matches : ");
		int matches = sc.nextInt();
		
		int userWins = 0;
		int computerWins = 0;
		int draw = 0;
		
		for(int i=0;i<matches;i++) {
			System.out.print("Choose your turn : ");
		    int user = sc.nextInt();
		    Random ran = new Random();
		    int computer = ran.nextInt(1,4);
		    if (computer == 1) {
		    	System.out.println("PC choose stone");
		    }
		    else if (computer == 2) {
		    	System.out.println("PC choose paper");
		    }
		    else if (computer == 3) {
		    	System.out.println("PC choose scissor");
		    }
		    if(user == 1 && computer == 1) {
		    	System.out.println("Draw");
		    	draw++;
		    	System.out.println();
		    }
		    else if(user == 1 && computer == 2) {
		    	System.out.println("Computer wins");
		    	computerWins++;
		    	System.out.println();
		    }
		    else if(user == 1 && computer == 3) {
		    	System.out.println("User wins");
		    	userWins++;
		    	System.out.println();
		    }
		    else if(user == 2 && computer == 1) {
		    	System.out.println("user wins");
		    	userWins++;
		    	System.out.println();
		    }
		    else if(user == 2 && computer == 2) {
		    	System.out.println("Draw");
		    	draw++;
		    	System.out.println();
		    }
		    else if(user == 2 && computer == 3) {
		    	System.out.println("Computer wins");
		    	computerWins++;
		    	System.out.println();
		    }
		    else if(user == 3 && computer == 1) {
		    	System.out.println("Computer wins");
		    	computerWins++;
		    	System.out.println();
		    }
		    else if(user == 3 && computer == 2) {
		    	System.out.println("user wins");
		    	userWins++;
		    	System.out.println();
		    }
		    else if(user == 3 && computer == 3) {
		    	System.out.println("Draw");
		    	draw++;
		    	System.out.println();
		    }
		}
		
		if(userWins > computerWins ) {
			System.out.println("User wins the Series..");
		}
		else if(computerWins > userWins ) {
			System.out.println("Computer wins the Series..");
		}
		else if(userWins == computerWins) {
			System.out.println("Series draw..");
		}
	}

}
