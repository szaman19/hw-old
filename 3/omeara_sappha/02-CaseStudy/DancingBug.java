/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug{

    private int[] numTurns;
    private int pos;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] turns){
	numTurns = turns;
	pos = 0;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act(){
	if (pos >= numTurns.length){
	    pos = 0;
	}
	for (int i = 0; i < numTurns[pos]; i ++) {
	    turn();
	}
	pos ++;
	//should use super on this part
        if (canMove()){
            move();
        }
        else{
            turn();
            turn();
        }
    }
}
