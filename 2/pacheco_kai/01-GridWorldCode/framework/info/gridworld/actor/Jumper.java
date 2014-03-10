package info.gridworld.actor;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

public class Jumper extends Actor{

	public Jumper(){
		setColor(Color.GREEN);
	}
	public Jumper(Color jumperColor){
		setColor(jumperColor);
	}

	public void act()
    {
        if (canMove())
            move();
        else
            turn();
    }
	public void turn()
    {
        setDirection(getDirection() + Location.HALF_RIGHT);
    }
	public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location nextNext=next.getAdjacentLocation(getDirection());
        if (gr.isValid(nextNext))
            moveTo(nextNext);
        else
            removeSelfFromGrid();
    }
}