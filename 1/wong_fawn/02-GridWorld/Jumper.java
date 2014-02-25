import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower; 
import info.gridworld.actor.Rock; 
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location; 

import java.awt.Color; 

public class Jumper extends Actor { 
	public Jumper() { 
		setColor(Color.RED); 
	} 

	public Jumper(Color color) { 
		setColor(color); 
	} 

	public void act() { 
		if (canJump()) 
			jump(); 
		else 
			turn(); 
	} 

	public void jump() { 
		Grid<Actor> g = getGrid(); 
		if (g == null) 
			return; 
		Location loc = getLocation(); 
		Location adj = loc.getAdjacentLocation(getDirection()); 
		Location twoPlacesOver = adj.getAdjacentLocation(getDirection()); 
		if (g.isValid(twoPlacesOver)) 
			moveTo(twoPlacesOver); 
		else 
			removeSelfFromGrid(); 
	} 

	public boolean canJump() { 
		Grid<Actor> g = getGrid(); 
		if (g == null) 
			return false; 
		Location loc = getLocation(); 
		Location adj = loc.getAdjacentLocation(getDirection()); 
		if (!g.isValid(adj)) 
			return false; 
		Actor neighbor = g.get(adj); 
		if (!((neighbor == null) || (neighbor instanceof Flower) 
			|| (neighbor instanceof Rock))) 
			return false; 

		Location twoPlacesOver = adj.getAdjacentLocation(getDirection()); 
		if (!g.isValid(twoPlacesOver)) 
			return false; 

		neighbor = g.get(twoPlacesOver); 
		return (neighbor == null) || (neighbor instanceof Flower); 
	} 

	public void turn() { 
		setDirection(getDirection() + Location.HALF_RIGHT); 
	} 
}
	
