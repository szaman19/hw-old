  import java.io.*;
  import java.util.*;
  
  class Knight
  {
      public char[][] board;
      public int h,w;
      public boolean solved = false;
      final public char me='z';
      final public char wall=' ';
      final public char path= '0';
      final public char exit='$';
      public char travelled='A';
      public Knight(String filename)
      {
  	board = new char[80][25];
  	h=0;
  	w=0;
  	try
  	    {
  
  		FileInputStream fstream=new FileInputStream(filename);
  		DataInputStream in = new DataInputStream(fstream);
  
  		while (in.available()!=0)
  		    {
  			String line = in.readLine();
  			if (w==0)
  			    w = line.length();
  			for (int i=0;i<line.length();i++)
  			    {
  				board[i][h]=line.charAt(i);
  			    }
  			h++;
  		    }
  		in.close();
  	    }
  	catch (Exception e)
  	    {
  		System.err.println("File Input Error");
  	    }
  
      }
  
      public String toString()
      {
  	String s = " [0;0H";
  	int i,j;
  	for (i=0;i<h;i++)
  	    {
  		for (j=0;j<w;j++)
  		    {
  			s = s + board[j][i];
  		    }
  
  		s = s + "\n";
  	    }
  	return s;
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
  
  	if (travelled == 'Y') {
  	    solved = true;
  	} else if (board[x][y]==path){
   
  	    try{   delay(75);
  		System.out.println(this);
  		board[x][y] = (char)travelled;
  		travelled++;
  		solve(x+2,y+1);
  		if (!solved )
  		    solve(x+2,y-1);
  		if (!solved )
  		    solve(x+1,y-2);
  		if (!solved)
  		    solve(x+1,y+2);
  		if (!solved)
  		    solve(x-1,y-2);
  		if (!solved)
  		    solve(x-1,y+2);
  		if (!solved)
  		    solve(x-2,y-1);
  		if (!solved)
  		    solve(x-2,y+1);
       
     
  	    }
  	    catch (Exception e){
     
  	    }
   
  
  	}
      }
  
  
      public static void main(String[] args)
      {
  	Knight m = new Knight("knight.dat");
  
  	System.out.println(" [2J");
  	System.out.println(m);
  	m.solve(2,3);
      }
  
  }
