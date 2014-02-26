package info.gridworld.actor;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
public class Jumper extends Actor
{
    public Jumper()
    {
        setColor(Color.RED);
    }
    public Jumper(Color bugColor)
    {
	setColor(bugColor);
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
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	if (gr.isValid(next))
            moveTo(next);
	else
            removeSelfFromGrid();
    }
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
	Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
        // ok to move into empty location or onto flower                                                                      
        // not ok to move onto any other actor                                                                                
    }
}
