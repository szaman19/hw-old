import java.io.*;
import java.util.*;

public class Knights{
    private int[][] x;
    private ArrayList<Integer>a;
    private int count, maxmoves,width, height;
    private int rmove,cmove;
    private boolean solved=false;
    
    
    public Knights(int r, int c){
	x = new int[r][c];
	for (int i=0;i<c;i++){
	    for (int j=0;j<r;j++){
		x[i][j]=0;
	    }
	}
	maxmoves=r*c;
	count=1;
	width=r;
	height=c;
	rmove=-2;
	cmove=1;
    }

    public void solve(int r, int c){
	if (!isPossible(r,rmove,c,cmove))
	    return;
	if (count==maxmoves){
	    solved = true;
	    System.out.println(this);
	    return;
	}
	
	else {
	    x[r][c]=count;
	    count++;
	    System.out.println(this);
	    
	    solve((r-2),(c+1));
	    if (!solved){
		rmove=-2;
		cmove=-1;
		solve((r-2),(c-1));
	    }
	    if (!solved){
		rmove=2;
		cmove=1;
		solve((r+2),(c+1));
	    }
	    if (!solved){
		rmove=2;
		cmove=-1;
		solve((r+2),(c-1));
	    }
	    if (!solved){
		rmove=-1;
		cmove=-2;
		solve((r-1),(c-2));
	    }
	    if (!solved){
		rmove=-1;
		cmove=2;
		solve((r-1),(c+2));
	    }
	    if (!solved){
		rmove=1;
		cmove=2;
		solve((r+1),(c+2));
	    }
	    if (!solved){
		rmove=1;
		cmove=-2;
		solve((r+1),(c-2));
	    }
	    x[r][c]=0;
	    count--;
	    
	}
    }
    
    public boolean isPossible(int r, int rm, int c, int cm){
	int e = r+rm;
	int f = c+cm;
	if ((e<=width) && (f<=height)&& (x[e][f]==0))
	    return true;
	return false;
    }

    public String toString(){
        String s="";
	for (int i=0;i<x.length;i++){
	    for (int j=0;j<x[0].length;j++){
		s=s+x[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public static void main(String[] args){
	Knights k = new Knights(5,5);
       	k.solve(0,0);
	System.out.println(k.toString());
    }
}
