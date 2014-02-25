public class nQueens{
	String[][] CHESSBOARD = new String[8][8];

		public String toString(){
/*///////////////////////////////////////////////////////
Copied from Knight's Tour
1) Go through each row
2) Go through each row's column using the second loop inside the first loop
3) catenate to returnString using the for initialized numbers.
4) Return the catenated string
*////////////////////////////////////////////////////////
		String returnString = "";
		for (int rows = 0; rows < CHESSBOARD.length; rows++){
			returnString = returnString + "\n\n";
			for (int columns = 0; columns < CHESSBOARD[0].length; columns++){
				returnString =returnString + CHESSBOARD[rows][columns] + "   ";
			}
		}
		return returnString + "\n";
	}

	public nQueens(int numQueens){
/*//////////////////////////////////////////////////////
If the number given is > 8... 
numQueens / 8 rows will be filled
numQueens % 8 will be needed to be filled now at row numQueens + 1
else just fill up numQueens spots starting at row 1 if numQueens < 8
*///////////////////////////////////////////////////////////
		int rowsToFill = numQueens / 8;
		int impartialNumberFill = numQueens % 8;
		if (rowsToFill > 0){
			for (int rowsToFillCounter = 0; rowsToFillCounter < rowsToFill; rowsToFillCounter++){
				for (int eightCounter = 0; eightCounter != 8; eightCounter++){
					CHESSBOARD[rowsToFillCounter][eightCounter] = "Q";
				}
			}
		}
		for (int impartialNumberFillCounter = 0; impartialNumberFillCounter < impartialNumberFill; impartialNumberFillCounter++){
			CHESSBOARD[rowsToFill][impartialNumberFillCounter] = "Q";
		}
	}

	public int[] farthestQueenCoordinates(){
/*/////////////////////////////////////////////////////////////
Returns an array of ints containing the Xcoordinate and Ycoordinate
of the farthest Queen. This queen will be moved around and constantly
checked. 

Essentially, this goes through the chessboard and waits until it meets
something that is NOT a Q, and records the last Q's x and y coordinate
*//////////////////////////////////////////////////////////////
		int[] returnIntArray = new int[2];
		int queenCounter = 0;
		for (int rows = 0; rows <8; rows++){
			for (int columns = 0; columns < 8; columns++){
				if (CHESSBOARD[rows][columns]=="Q"){
					queenCounter++;
				}
				else{
					if (rows==7){
						returnIntArray[0] = 0; 
					}
					else{
						returnIntArray[0] = queenCounter/8 ;
					}
					returnIntArray[1] = columns - 1;
					if (returnIntArray[1] == -1){
						returnIntArray[1] = queenCounter / 8;
						returnIntArray[0] = 1;
						return returnIntArray;
					}
					return returnIntArray;
				}
			}
		}
		return returnIntArray;
	}

	public boolean queenCheck(){
/*/////////////////////////////////////////////////////////////////
This will check if the farthest queen is in range of capturing any
queens or kings(aka fixed Queens).

First, run the farthestQueenCoordinates function to find the coordinates.
Then, check if any queens or kings are on the row and column of 
the farthest queen. 
then check the diagonals.

If at any point the checks fail, return false. 
If everything works out, turn the farthest queen into a king 
(aka a fixed queen with all of its requirements in check)
*///////////////////////////////////////////////////////////////////
	int[] farthestQueenCoordinatesArray = this.farthestQueenCoordinates();
	int farthestQueenX = farthestQueenCoordinatesArray[0];
	int farthestQueenY = farthestQueenCoordinatesArray[1];
	boolean isAtEnd = false;

	System.out.println("Checking X:farthestQueenX " +farthestQueenX );
	System.out.println("Checking farthestQueenY: " + farthestQueenY);

	CHESSBOARD[farthestQueenX][farthestQueenY] = "CHECK";

	System.out.println(toString());


	for (int rows = 0; rows < 8; rows++){
		for (int columns = 0; columns < 8; columns++){
			if (CHESSBOARD[rows][columns] == "Q" || CHESSBOARD[rows][columns] == "K"){
				if (rows == farthestQueenX || columns == farthestQueenY){

					System.out.println("Checking farthestQueenX: " + farthestQueenX);
					System.out.println("Checking farthestQueenY: " + farthestQueenY);


					CHESSBOARD[farthestQueenX][farthestQueenY] = "null";
					if(farthestQueenX != 7 && farthestQueenY != 7){
						if (farthestQueenX == 7){
							CHESSBOARD[0][farthestQueenY + 1] = "Q";
						} 
						else{
							CHESSBOARD[farthestQueenX][farthestQueenY + 1] = "Q";
						}
					}

					return false;
				}
				for (int diagonalRadius = 1;isAtEnd != true; diagonalRadius++){
					if (farthestQueenX + diagonalRadius > 8 || farthestQueenY + diagonalRadius > 8 || farthestQueenX - diagonalRadius < 0 || farthestQueenY - diagonalRadius < 0){
						isAtEnd = true;
					}
					else{
					
					if (rows == farthestQueenX + diagonalRadius && columns == farthestQueenY + diagonalRadius){
						CHESSBOARD[farthestQueenX][farthestQueenY] = null;
						if(farthestQueenX != 7 && farthestQueenY != 7){
							if (farthestQueenX == 7){
								CHESSBOARD[0][farthestQueenY + 1] = "Q";
							} 
							else{
								CHESSBOARD[farthestQueenX][farthestQueenY+1] = "Q";
							}
						}
						return false;
					}
					if (rows == farthestQueenX + diagonalRadius && columns == farthestQueenY - diagonalRadius){
						CHESSBOARD[farthestQueenX][farthestQueenY] = null;
						if(farthestQueenX != 7 && farthestQueenY != 7){
							if (farthestQueenX == 7){
								CHESSBOARD[0][farthestQueenY + 1] = "Q";
							} 
							else{
								CHESSBOARD[farthestQueenX][farthestQueenY+1] = "Q";
							}
						}
						return false;
					}
					if (rows == farthestQueenX - diagonalRadius && columns == farthestQueenY + diagonalRadius){
						CHESSBOARD[farthestQueenX][farthestQueenY] = null;
						if(farthestQueenX != 7 && farthestQueenY != 7){
							if (farthestQueenX == 7){
								CHESSBOARD[0][farthestQueenY + 1] = "Q";
							} 
							else{
								CHESSBOARD[farthestQueenX][farthestQueenY + 1] = "Q";
							}
						}
						return false;
					}
					if (rows == farthestQueenX - diagonalRadius && columns == farthestQueenY - diagonalRadius){
						CHESSBOARD[farthestQueenX][farthestQueenY] = null;
						if(farthestQueenX != 7 && farthestQueenY != 7){
							if (farthestQueenX == 7){
								CHESSBOARD[0][farthestQueenY + 1] = "Q";
							} 
							else{
								CHESSBOARD[farthestQueenX][farthestQueenY + 1] = "Q";
							}
						}
						return false;
						}
					}
				}
			}
		}
	}
	CHESSBOARD[farthestQueenX][farthestQueenY] = "K";
	return true;
}

public void Solve(){
	boolean anyQueensLeft = true;
	if (anyQueensLeft == true && queenCheck() == false){

	}
}

public static void main(String[] args){
		nQueens test = new nQueens(8);
		System.out.println(test);
		System.out.println(test.queenCheck());
		System.out.println(test);
	}
}