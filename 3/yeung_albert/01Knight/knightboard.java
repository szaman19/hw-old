public class knightboard{
    private int moves;
    private boolean done = false;
    private int[][] board;
    private int l;
    private int a, b, c, d, e, f, g, h;
    private int i,j;
    
    public knightboard(int n){
        board = new int[n][n];
        moves = 1;
        l = n;
    }

    public String toString(){
	String s = "";
	for (i=0;i<l;i++){
            for (j=0;j<l;j++){
                s += board[j][i] + "\t";
            }
            s += "\n\n";
        }
	return s;
    }

    public boolean isdone(){
        return done;
    }
    
    public void run(int x, int y,int n){
        //System.out.println(this);
	if (n==l*l+1||done) {
	    done = true;
	    return;
	}
        else if (board[x][y]==0){
            if (!done&&x+1<l&&y+2<l){
                board[x][y]=n;
                run(x+1,y+2,n+1);
            }
	    if (!done&&x+2<l&&y+1<l) {
                board[x][y]=n;
		run(x+2,y+1,n+1);
            }
	    if (!done&&x+2<l&&y-1>=0){
                board[x][y]=n;
		run(x+2,y-1,n+1);
            }
	    if (!done&&x+1<l&&y-2>=0){
                board[x][y]=n;
		run(x+1,y-2,n+1);
            }
            if (!done&&x-1>=0&&y-2>=0){
                board[x][y]=n;
                run(x-1,y-2,n+1);
            }
            if (!done&&x-2>=0&&y-1>=0){
                board[x][y]=n;
                run(x-2,y-1,n+1);
            }
            if (!done&&x-2>=0&&y+1<l){
                board[x][y]=n;
                run(x-2,y+1,n+1);
            }
            if (!done&&x-1>=0&&y+2<l){
                board[x][y]=n;
                run(x-1,y+2,n+1);
            }
            //board[x][y]=n;
	}
    }

    public static void main(String[]args){
        knightboard n = new knightboard(8);
        n.run(0,0,1);
        System.out.println(n);
        if (!n.isdone()){
            System.out.println("DIDN'T WORK");
        }        
    }    
}
