import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;


public class Jumper extends Actor{
    public Jumper(){
	super();
    }
    
    public void act(){
	Location loc1 = getLocation();
	Location loc2 = loc1.getAdjacentLocation(this.getDirection());
	Location loc3 = loc2.getAdjacentLocation(this.getDirection());
	Grid<Actor> gr = getGrid();
	
	if (gr.isValid(loc3) && (gr.get(loc3) == null || !(gr.get(loc3) instanceof Rock)))
	    moveTo(loc3);
	
	else if(gr.isValid(loc2) && (gr.get(loc2) == null || !(gr.get(loc2) instanceof Rock)))
	    moveTo(loc2);
	
	else
	    setDirection(getDirection() + 45);
	
    
    }	    

}
