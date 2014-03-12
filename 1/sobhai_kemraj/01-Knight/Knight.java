import java.io.*;
import java.util.*;

public class Knight{
    private char[][] Board;
    private boolean solved;
    private int counter, a, b;

    public Knight(int x, int y){
	Board  = new char[x][y];
	for (int i = 0; i < x; i ++){
	    for (int j = 0; j < y; j ++)
		Board[i][j]='-';
	}
	solved = false;
	counter = 0;
	a=x;
	b=y;
    }

    private void delay(int n)
    {
	try{
	    Thread.sleep(n);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }
    
    
    public void solve(int x,int y) {
	if (x>=a || y>=b || x < 0 || y < 0)
	    return;
	if (counter == a*b) {
	    solved = true;
	} else if (Board[x][y]=='-'){
	    delay(1000);
	    System.out.println(this);
	    Board[x][y]='K';
	    solve(x+1,y+2);
	    if (!solved )
		solve(x+1,y-2);
	    if (!solved )
		solve(x-1,y+2);
	    if (!solved)
		solve(x-1,y-2);
	    if (!solved )
		solve(x+2,y-1);
	    if (!solved )
		solve(x-2,y+1);
	    if (!solved)
		solve(x-2,y-1);
	    if (!solved)
		solve(x+2,y+11);
	}
	// otherwise it's a base case like hitting a wall, z, travelled
    }
    
    public String toString(){
	String s = "[0;0H";
	int i,j;
	for (i=0;i<a;i++){
	    for (j=0;j<b;j++){
		s = s + Board[j][i];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public static void main (String[] args){
	Knight m = new Knight(5,5);

	System.out.println("[2J");
	System.out.println(m);
	m.solve(2,3);
    }
}