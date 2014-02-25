/* Imagine my satisfaction when you announce a homework question that I've already done ! 
I've been doing this nationwide online CS competition thing like USAMO except CS and the way they do it in Mathland to determine who 
in the US is qualified to represent the country's team in the IMO is different; they do yearly examinations, with USACO, you do monthly online tests
coupled with ongoing training problems. The n-queens problem was one of the training problems! All I had to do was copy the checker.java file into 
this folder and fix some minor grievances (you give in the N parameter through the args String[] instead of through a .in file, 
it used to only work up to N = 13, also they had me print the first 3 solutions followed by the number of 
possible solutions so I changed it so it prints all soltuions, etc. etc.), and boom ! Done with the homework. Maybe I'll do the other problem for 
extra credit. 

P.S.: I want to discuss the "Arrogant Man's Dilemma" ... when you announced this in class, I wanted to shout "Oh, that difficult math-y problem? I've 
already solved it!" to satiate my monstrous ego, but I also didn't want to sound like I was just doing that. Now I was stuck with a hard decision - If I
just up and announced that I had solved this problem, would I be perceived as intelligent like I want to, or would I just look like a massive loser who wants
to constantly remind others that he is , in fact ,the smartest man in the room?

/*
ID: omarbic1
LANG: JAVA
PROG: checker
*/
import java.util.*;
import java.io.*;

public class checker {
	static boolean[] canCol;
	static boolean[] leftDiag;
	static boolean[] rightDiag;
	static int[] answer;
	static int boardSize;
	static int printTime;
	public static void main(String[] args) throws IOException, NumberFormatException, ArrayIndexOutOfBoundsException {
		long startTime = System.currentTimeMillis();
		boardSize = 8;
		if (args.length == 0)
			System.out.println("You can pass a unique N arg when you run the program. If you don't (as you haven't now), I'll just use 8.");
		else
			boardSize = Integer.parseInt(args[0]);
		System.out.println("The board is arranged as such : ");
		for (int i = 1; i <= boardSize; i++) {
			String answer = new String();
			for (int k = 1; k <= boardSize; k++) {
				answer += k + "," + i + " ";
			}
			answer += "\n";
			System.out.print(answer);
		}
		System.out.println("Each answer is represented by it's own line and consists of " + boardSize + " pairs, each representing the coordinate" + 
			"of a queen on the board.");
		System.out.println("-------------");
		canCol = new boolean[boardSize];
		answer = new int[boardSize];
		leftDiag = new boolean[boardSize * 2];
		rightDiag = new boolean[boardSize * 2];
		printTime = 0;
		queenIt(0);
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + ((endTime - startTime) / 1000.0) + " seconds to calculate");
		System.exit(0);
	}
	public static void queenIt(int column) {
		if (column == boardSize) {
				for (int p = 0; p < boardSize - 1; p++)
					System.out.print((p + 1) + "," + (answer[p] + 1) + " ");
				System.out.print((boardSize) + "," + (answer[boardSize - 1] + 1) + "\n");
				printTime++;
				return;
			}		
		for (int row = 0; row < boardSize; row++) {
			if (!canCol[row] && !rightDiag[row + column] && !leftDiag[row - column + boardSize]) {
				canCol[row] = rightDiag[row + column] = leftDiag[row - column + boardSize] = true;
				answer[column] = row;
				queenIt(column + 1);
				canCol[row] = rightDiag[row + column] = leftDiag[row - column + boardSize] = false;
			}
		}
		return;
	}

}
