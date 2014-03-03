import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower; 
import info.gridworld.actor.Rock; 
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location; 
 
import java.awt.Color;

public class Jumper extends Actor{

	public void jump(){ 
		Grid<Actor> gr = getGrid(); 
		 if (gr == null) 
			return; 
		 Location loc = getLocation(); 
		 Location next = loc.getAdjacentLocation(getDirection()); 
		 Location twoAway = next.getAdjacentLocation(getDirection()); 
		 if (gr.isValid(twoAway)) 
			moveTo(twoAway); 
		 else 
			removeSelfFromGrid(); 
	}
	
	public void turn(){ 
		setDirection(getDirection() + Location.HALF_RIGHT); 
	}
	
	public boolean canJump(){ 
		Grid<Actor> gr = getGrid(); 
		if (gr == null) 
			return false; 
		Location loc = getLocation(); 
		Location next = loc.getAdjacentLocation(getDirection()); 
		if (!gr.isValid(next)) 
			return false; 
		Actor neighbor = gr.get(next); 
		if (!((neighbor == null) || (neighbor instanceof Flower) 
		|| (neighbor instanceof Rock))) 
			return false;
		Location twoAway = next.getAdjacentLocation(getDirection()); 
		if (!gr.isValid(twoAway)) 
			return false; 
		neighbor = gr.get(twoAway); 
		return ((neighbor == null) || (neighbor instanceof Flower)); 
	 } 

	
	public void act() { 
		if (canJump()) 
			jump(); 
		else	 
			turn(); 
	} 	
	

	
	
}