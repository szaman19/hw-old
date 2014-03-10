import java.io.*;
import java.util.*;

class KnightsTour
{
    private String[][] board;
    private int width, height, currMove, maxMoves;
    private boolean solved = false;

    public KnightsTour(int width, int height)
    {
        board = new String[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                board[i][j] = padNumber(-1);
            }
        }
        this.width = width;
        this.height = height;
        currMove = 1;
        maxMoves = width * height;
    }

    public String toString()
    {
        // String s = "[0;0H";
        String s = "";

        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                s += board[i][j] + " ";
            }

            s += "\n";
        }
        return s;
    }

    private void delay(int n)
    {
        try{
            Thread.sleep(n);
        }catch (InterruptedException e) {
            System.out.println("Interrupt..");
            System.exit(0);
        }
    }

    private String padNumber(int n)
    {
        int length = String.valueOf(n).length();
        int maxLength = String.valueOf(maxMoves).length();

        if (length < maxLength) {
            String s = "";
            int diff = maxLength - length;
            for (int i = 0; i < diff; i++) {
                s = "0" + s;
            }
            return s + n;
        } else {
            return "" + n;
        }
    }

    private boolean validateMove(int x, int y)
    {
        // if (x < 0 || y < 0)
        //     return false;

        // if (x >= width || y >= height)
        //     return false;

        try {
            return board[x][y].equals(padNumber(-1));
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }


    public void solve(int x, int y) {
        if (!validateMove(x, y)) {
            return;
        }

        // delay(1);
        if (currMove == maxMoves) {
            solved = true;
            board[x][y] = padNumber(currMove);
            System.out.println(this);
            return;
        } else {
            board[x][y] = padNumber(currMove);
            currMove++;
            // System.out.println(this);
            solve(x+2,y+1);
            if (!solved) 
                solve(x+2,y-1);
            if (!solved) 
                solve(x+1,y+2);
            if (!solved) 
                solve(x+1,y-2);
            if (!solved) 
                solve(x-1,y+2);
            if (!solved) 
                solve(x-1,y-2);
            if (!solved) 
                solve(x-2,y+1);
            if (!solved) 
                solve(x-2,y-1);
            if (!solved) {
                board[x][y] = padNumber(-1);
                currMove--;
            }
        }
    }


    public static void main(String[] args)
    {
        KnightsTour kt = new KnightsTour(8, 8);

        System.out.println("[2J");
        kt.solve(0,4);

    }

}

