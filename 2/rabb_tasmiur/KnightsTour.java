
public class KnightsTour {
	
	private static int fsize = 5;
	private static int board[][] = new int [fsize][fsize];
	private static int[] xmoves = {1, 2, 2, 1, -1, -2, -2, -1};
	private static int[] ymoves = {-2, -1, 1, 2, 2, 1, -1, -2};
	
	public static boolean solve(int movenum, int x, int y){
		boolean sol = true;
		board[x][y] = movenum;
		if(movenum == ((fsize*fsize) - 1)){
			for (int a = 0; a < fsize; a++){
				for (int b = 0; b < fsize; b++){
					System.out.printf("%3d", board[a][b]);
				}
				System.out.println("\n");
			}
		}
		else{
			for (int z = 0; z < 8; z++){
				if ((x + xmoves[z]) >= 0 && (x + xmoves[z]) < fsize 
						&& (y + ymoves[z]) >= 0 && (y + ymoves[z]) < fsize)
				{
					if(board[x + xmoves[z]][y + ymoves[z]] == -1){
						if (solve(movenum + 1, (x + xmoves[z]), (y + ymoves[z]))){;
								break;
					}
				}
			}
		}
			sol = false;
			board[x][y] = -1;
		}
			return sol;
}	
	
	public static void main(String[]args){
		for ( int z = 0; z < fsize; z++){
			for ( int w = 0; w < fsize; w++){
				board[z][w] = -1;
			}
		}
		solve(0,0,0);
}
}