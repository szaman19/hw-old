import java.io.*;
import java.util.*;

public class KnightsTour{

	public String[][] CHESSBOARD;
	int KNIGHTXPOSITION;
	int KNIGHTYPOSITION;
	int ROWLENGTH;
	int COLUMNLENGTH;
	boolean solved = false;

	public int getKNIGHTXPOSITION(){
		return KNIGHTXPOSITION;
	}
	public int getKNIGHTYPOSITION(){
		return KNIGHTYPOSITION;
	}

	public KnightsTour(int row, int column){
		CHESSBOARD = new String[column][row];
		KNIGHTXPOSITION = (int)(column * Math.random());
		KNIGHTYPOSITION = (int)(row * Math.random());
		CHESSBOARD[KNIGHTXPOSITION][KNIGHTYPOSITION] = "K";
		ROWLENGTH = row;
		COLUMNLENGTH = column;
		
		for (int rows = 0; rows < CHESSBOARD.length; rows++){
			
			for (int columns = 0; columns < CHESSBOARD[0].length; columns++){
				if (CHESSBOARD[rows][columns] == null){
					CHESSBOARD[rows][columns] = "[]";
				}
			}
		}
	}

	public boolean boardSolvedCheck(){
		int stepCounter = 0;
		int desiredStepAmount = ROWLENGTH * COLUMNLENGTH - 1;
		for (int rows = 0; rows < CHESSBOARD.length; rows++){
			for (int columns = 0; columns < CHESSBOARD[rows].length; columns++){
				if (CHESSBOARD[rows][columns].equals("[?]")){
						stepCounter++;
						System.out.println(stepCounter);
						System.out.println(desiredStepAmount);
			}
		}
			if (stepCounter == desiredStepAmount){
				return true;			
			}
	}
	return false;
}
/*
	NORTHWEST X
	NORTHEAST X
	WESTNORTH X
	WESTSOUTH X
	SOUTHWEST X
	SOUTHEAST X
	EASTNORTH X
	EASTSOUTH X
*/
	public void solve(int x, int y){
		if (this.boardSolvedCheck() == true){
			solved = true;
		}
		else{
			if (!solved){
				if (x + 3 < ROWLENGTH && y + 1 < COLUMNLENGTH && !CHESSBOARD[x + 3][y + 1].equals("[?]")){
					solve(x+3,y+1); //EASTNORTH
					CHESSBOARD[x][y]="[?]";
					System.out.println(this);
				}
			}
			if (!solved){
				if (x+3 < ROWLENGTH && y - 1 > 0 && !CHESSBOARD[x + 3][y - 1].equals("[?]")){
					solve(x+3,y-1); //EASTSOUTH
					CHESSBOARD[x][y]="[?]";
					System.out.println(this);
				}
			}
			if (!solved){
				if (x+1 < ROWLENGTH && y + 3 < COLUMNLENGTH && !CHESSBOARD[x + 1][y + 3].equals("[?]")){
					solve(x+1,y+3); //NORTHEAST
					CHESSBOARD[x][y]="[?]";
					System.out.println(this);
				}
			}
			if (!solved){
				if (x+1 < ROWLENGTH && y - 3 > 0 && !CHESSBOARD[x+ 1][y - 3].equals("[?]")){
					solve(x+1,y-3); //SOUTHEAST
					CHESSBOARD[x][y]="[?]";
					System.out.println(this);
				}
			}
			if (!solved){
				if (x - 1 > 0 && y - 3 > 0 && !CHESSBOARD[x - 1][y - 3].equals("[?]")){
					solve(x-1,y-3); //SOUTHWEST
					CHESSBOARD[x][y]="[?]";
					System.out.println(this);
				}
			}
			if (!solved){
				if (x-3 > 0 && y - 1 > 0 && !CHESSBOARD[x - 3][y -1].equals("[?]")){
					solve(x-3,y-1); //WESTSOUTH
					CHESSBOARD[x][y]="[?]";
					System.out.println(this);
				}
			}
			if (!solved){
				if (x - 3 > 0 && y + 1 < COLUMNLENGTH && !CHESSBOARD[x - 3][y + 1].equals("[?]")){
					solve(x-3,y+1); //WESTNORTH
					CHESSBOARD[x][y]="[?]";
					System.out.println(this);
				}
			}
			if (!solved){
				if (x-1 > 0 && y + 3 < COLUMNLENGTH && !CHESSBOARD[x - 1][y + 3].equals("[?]")){
					solve(x-1,y+3); //NORTHWEST
					CHESSBOARD[x][y]="[?]";
					System.out.println(this);
				}
			}
		}
	}






// RANDOM FUNCTIONALITY	static int x = (int)(100*Math.random());

// ADD NEW LINE --> Go through rows--> Go through column 
//	--> add to returnString
	public String toString(){
		String returnString = "";
		for (int rows = 0; rows < CHESSBOARD.length; rows++){
			returnString = returnString + "\n\n";
			for (int columns = 0; columns < CHESSBOARD[0].length; columns++){
				returnString =returnString + CHESSBOARD[rows][columns] + "   ";
			}
		}
		return returnString + "\n";
	}

public static void main(String[] args){

	KnightsTour test = new KnightsTour(5,5);
	//System.out.println("[2J");
	System.out.println(test);
	//test.solve(test.getKNIGHTXPOSITION(),test.getKNIGHTYPOSITION());
	test.solve(0,0);
	}
}
