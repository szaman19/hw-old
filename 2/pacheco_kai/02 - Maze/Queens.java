import java.io.*;
import java.util.*;

public class Queens{
	public char[][] board;
	public int counter;
	public int n;
	public boolean solved;
	final public char queen='q';
	final public char empty='.';
	final public char unable='x';
	
	public Queens(int n){
		this.n=n;
		board = new char[n][n];
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				board[x][y]=empty;
			}
		}
		counter=0;
		solved=false;
	}
	public String toString(){
		String ans="";
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				if(board[x][y]==unable){
					ans=ans+String.valueOf(empty);
				}else{
					ans=ans+String.valueOf(board[x][y]);}
			}
			ans+="\n\n";
		}
		return ans;
	}
	
	private void delay(int n){
		try{
			Thread.sleep(n);
		}catch(InterruptedException e) {
			System.exit(0);
		}
	}
	private void setUnables(int x, int y){
		for(int a=0;a<n;a++){
			board[x][a]=unable;
			board[a][y]=unable;
			try{
				board[x+a][y+a]=unable;
				board[x+a][y-a]=unable;
				board[x-a][y+a]=unable;
				board[x-a][y-a]=unable;
			}catch(Exception e){}
		}
	}
	public void solve(int x, int y){
		if(counter==n){
			solved=true;
		}else if(x>=0 && y>=0 && x<n && y<n && board[x][y]==empty){
			counter++;
			setUnables(x,y);
			board[x][y]=queen;
			System.out.println(this);
			delay(1000);

			solve(x+2,y+1);
			if(!solved){
				solve(x-2,y+1);
			}
			if(!solved){
			 	solve(x+2,y-1);
			}
			if(!solved){
				solve(x-2,y-1);
			}
			if(!solved){
				solve(x-1,y+2);
			}
			if(!solved){
			 	solve(x+1,y-2);
			}
			if(!solved){
				solve(x-1,y-2);}
			if(!solved){
				solve(x+1,y+2);}
			if(!solved){
			board[x][y]=empty;
			counter--;}
		}
	}
	
	public static void main(String[] args){
		Queens a = new Queens(5);
		a.solve(3,3);
		System.out.println(a.toString());
	}

}