// Nicholas Romanoff
// Period One
// Homework #01 KnightsTour
// 2014-02-23

import java.io.*;
import java.util.*;

class KnightsTour {

	public int[][] _board;
	public int _size;
	public boolean _solved = false;
	public int _count = 1;

	public KnightsTour(int size) {
		_size = size;
		_board = new int[_size][_size];
		for (int x = 0; x < _size; x++) {
			for (int y = 0; x < _size; x++) {
				_board[x][y] = 0;
			}
		}
	}

	public String toString() { 
		String retStr = "\n";
        	for (int[] x : _board) {
			String retRow = "";
			for (int y : x) {
				if (y < 10) {
					retRow += y + "  ";
				}
				else {
					retRow += y + " ";
				}
			}
			retStr += retRow + "\n";
		}	
		return retStr;
	}

	public boolean inBounds(int x, int y) {
		return (x >= 0) && (y >= 0) && (x < _size) & (y < _size);
	}

	public boolean isValid(int x, int y) {
		return (inBounds(x,y) && (_board[x][y] == 0));
	}


    	private void delay(int n) {
		try {
			Thread.sleep(n);
		}
		catch (InterruptedException e) {
			System.exit(0);
		}
    	}

	public void solve(int x, int y) {
		if (_count >= (_size * _size)) {
			System.out.println(this);
			_solved = true;
		}
		else if (isValid(x,y)) {
			_board[x][y] = _count;
			_count++;
			System.out.println(this);
			solve(x + 1, y + 2);
			if (!_solved) {
				solve(x + 2, y + 1);
			}
			if (!_solved) {
				solve(x + 2, y - 1);
			}
			if (!_solved) {
				solve(x + 1, y - 2);
			}
			if (!_solved) {
				solve(x - 1, y - 2);
			}
			if (!_solved) {
				solve(x - 2, y - 1);
			}
			if (!_solved) {
				solve(x - 2, y + 1);
			}
			if (!_solved) {
				solve(x - 1, y + 2);
			}
			if (!_solved) {
				_board[x][y] = 0;
				_count -= 1;
			}	
			
		}
	}


	public static void main(String[] args) {
		KnightsTour kt = new KnightsTour(5);
		System.out.println(kt);
		kt.solve(2,1);
	}
}
