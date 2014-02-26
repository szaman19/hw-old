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

import info.gridworld.grid.Grid;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;



/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class Jumper extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public Jumper(int length)
    {
        steps = 0;
        sideLength = length;
    }

	public void move()
    {
		Grid<Actor> gr = getGrid();
        Location loc = getLocation();
		int direction = getDirection();
		Location next = loc.getAdjacentLocation(direction);
        Location next2 = next.getAdjacentLocation(direction);
		boolean yesF = false;
		boolean yesB = false;
		if (gr.isValid(next2)){
		
			yesF = (getGrid().get(next2) instanceof Flower || getGrid().get(next2) instanceof Rock);
			yesB = (getGrid().get(next2) instanceof Bug);
		}
		
		if (gr.isValid(next2)){
            if(yesF){
				if(gr.isValid(next2.getAdjacentLocation(direction))){
					moveTo(next2.getAdjacentLocation(direction));
					}
				else{
					turn();
					turn();
					}
				}
			else if(yesB){
				moveTo(next);
				}
			else{
				moveTo(next2);
				}
			}
        else if(gr.isValid(next)){
			moveTo(next);
			}
		else{
            removeSelfFromGrid();
			//Flower flower = new Flower(getColor());
			//flower.putSelfInGrid(gr, loc);
			}
	}
	
	public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }
    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            turn();
            steps = 0;
        }
    }
}
