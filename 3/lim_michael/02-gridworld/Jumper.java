import info.gridworld.actor.Actor; 
import info.gridworld.actor.Flower; 
import info.gridworld.actor.Rock; 
import info.gridworld.grid.Grid; 
import info.gridworld.grid.Location; 
import java.awt.Color; 

public class Jumper extends Actor { 

	public Jumper() { 
		setColor(Color.BLUE); 
	} 
	
	public Jumper(Color JumperColor) { 
		setColor(JumperColor); 
	} 
	
	public void act() { 
		if (canJump()) 
			jump(); 
		else 
			turn(); 
	} 
	
	public void turn() { 
		setDirection(getDirection() + 45); 
	}

	public void jump() { 
		Grid<Actor> grid = getGrid(); 
		if (grid == null) 
			return; 

		Location here = getLocation(); 
		Location one = here.getAdjacentLocation(getDirection()); 
		Location two = one.getAdjacentLocation(getDirection()); 

		moveTo(two); 
	} 
	
	public boolean canJump() { 
		Grid<Actor> grid = getGrid(); 
		if (grid == null) 
			return false; 
		
		Location here = getLocation(); 
		Location one = here.getAdjacentLocation(getDirection()); 
		
		if (!grid.isValid(one)) 
			return false; 
		
		Actor obj = grid.get(one); 
		
		if ((obj != null) && !(obj instanceof Flower) && !(obj instanceof Rock)) 
			return false; 
		
		Location two = one.getAdjacentLocation(getDirection()); 
		
		obj = grid.get(two); 
		
		if (((obj != null) && !(obj instanceof Flower)) || !grid.isValid(two))
			return false; 
		return true;
	} 
}