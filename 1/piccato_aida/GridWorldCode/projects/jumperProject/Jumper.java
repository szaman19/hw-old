import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

public class Jumper extends Bug{

    public Jumper() 
    {
	super(Color.GREEN);
    }
	
        
    public void move() 
    {
	Grid<Actor> gr = getGrid();
	if (gr == null) {
	    return;
	}
	Location loc = getLocation();
	Location temp = loc.getAdjacentLocation(getDirection());
	Location next = temp.getAdjacentLocation(getDirection());
	if (gr.isValid(next)) {
	    moveTo(next);
	}
	else {
	    removeSelfFromGrid();
	}
    }


    public boolean canMove() {
	Grid<Actor> gr = getGrid();
	if (gr == null) {
	    return false;
	}
	Location loc = getLocation();
	Location temp = loc.getAdjacentLocation(getDirection());
	Location next = temp.getAdjacentLocation(getDirection());
	if (!gr.isValid(next)) {
            return false;
	}
	Actor neighbor = gr.get(next);
        if ( (neighbor instanceof Rock) || (neighbor instanceof Flower) || (neighbor instanceof Actor) || (neighbor instanceof Jumper) {
	    return false;
	}
	return true;
    }

    
    public void act()
    {
        if (canMove())
            move();
        else
            turn();
    }	   

}
