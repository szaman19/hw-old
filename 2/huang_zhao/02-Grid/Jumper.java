package info.gridworld.actor;

import info.gridworld.grid.Grid;

import info.gridworld.grid.Location;


import java.awt.Color;
public class Jumper extends Actor{

    public Jumper()
    {
        setColor(Color.BLUE);
    }

   
    public Jumper(Color JumperColor)
    {
        setColor(JumperColor);
    }

    /**
     * Moves if it can move, turns otherwise.
     */
    public void act()
    {
        if (canJump())
            Jump();
        else
            turn();
    }

    /**
     * Turns the bug 45 degrees to the right without changing its location.
     */
    public void turn()
    {
        setDirection(getDirection() + Location.HALF_RIGHT);
    }

    /**
     * Moves the bug forward, putting a flower into the location it previously
     * occupied.
     */
    public void Jump()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
	Location next1 = next.getAdjacentLocation(getDirection());
        if (gr.isValid(next1))
            moveTo(next1);
        else
            removeSelfFromGrid();
       
    }

   
    public boolean canJump()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        if (!((neighbor == null || neighbor instanceof Flower)|| neighbor instanceof Rock)){
	    return false;
	}
	Location next1 = next.getAdjacentLocation(getDirection());
	if (!gr.isValid(next1)){
	    return false;
	}
	Actor neighbor1 = gr.get(next);
	return( neighbor1== null) || (neighbor1 instanceof Flower);
    
        
    }
}
    