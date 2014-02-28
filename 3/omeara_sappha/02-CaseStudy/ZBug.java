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
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int side;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
	side = 0;
	turn();
	turn();
    }

    /**
     * Moves to the next location of the square.
     */
    public void act(){
        if (steps < sideLength && canMove() && side < 3){
            move();
            steps ++;
        }
	else if (!canMove()){}
	//it can move, (steps < sideLength && side < 3) return false
	else if (side == 1){
	    turn();
	    turn();
	    turn();
	    turn();
	    turn();
	    steps = 0;
	    side ++;
	}
	else if (side < 3){ // side = 0, 2
            turn();
            turn();
	    turn();
            steps = 0;
	    side ++;
        }
	else {
	    //do not move at all
	}
    }
}
