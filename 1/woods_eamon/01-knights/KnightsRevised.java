public class Knights{
    private static boolean[][]visited;
    private static int[][]boardToPrint;

    public static String printer(){
	String y = "";
	for (int p = 0; p < boardToPrint.length; p++){
	    for (int q = 0; q < boardToPrint[0].length; q++){
		y+= boardToPrint[p][q] + "";
	    }
	    y+= "\n";
	}
	return y;
    }

    public static void setup(int c){
	visited = new boolean[c][c];
	boardToPrint = new int[c][c];

	for (int a = 0; a < visited.length; a++){
	    for (int b = 0; b < visited[0].length; b++){
		visited[a][b] = false;
	    } 
	}

        for(int i = 0; i < boardToPrint.length; i++){
            for (int n = 0; n < boardToPrint[0].length; n++){
                boardToPrint[i][n] = 0;
            }
	}
    }
    
    public static boolean move(int x, int y, int m){
	int N = visited.length;
	int M = (int)(Math.pow(visited.length,2)) - 1;
	

	if ( (x < 0) || (x >= N) || (y < 0) || (y >= N) ){
	    return false;
	}

	if (visited[x][y] == true){
	    return false;
	}

	if (m == M){
	    System.out.println("A solution has been found");
	    boardToPrint[x][y] = m;
	    System.out.println(printer());
	    visited[x][y] = true;
	    return true;
	} else {
	    boolean result = false;
	        
	    result = (result || move(x+2,y+1,m+1));
	    result = (result || move(x+2,y-1,m+1));
	    result = (result || move(x-2,y+1,m+1));
	    result = (result || move(x-2,y-1,m+1));
	    result = (result || move(x+1,y+2,m+1));
	    result = (result || move(x+1,y-2,m+1));
	    result = (result || move(x-1,y+2,m+1));
	    result = (result || move(x-1,y-2,m+1));
	        
	    if (result = true){
		visited[x][y] = true;
		boardToPrint[x][y] = m;
		System.out.println(printer());
		return true;
	    } else {
		visited[x][y] = false;
		return false;
	    }
	}
    }

    public static void main(String[]args){
	setup(5);
	move(3,3,0);
    }
}
