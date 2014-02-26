import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color; 

public class Jumper extends Actor 
{ 
    public Jumper() 
    { 
	setColor(Color.RED); 
    } 
 
    public Jumper(Color JumperColor) 
    { 
	setColor(JumperColor); 
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
	Location twoNext = next.getAdjacentLocation(getDirection()); 
	if (gr.isValid(twoNext)) 
	    moveTo(twoNext); 
	else 
	    removeSelfFromGrid(); 
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
	if (!((neighbor == null) || (neighbor instanceof Rock) || (neighbor instanceof Flower))) 
	    return false; 
	Location twoNext = next.getAdjacentLocation(getDirection()); 
	if (!gr.isValid(twoNext)) 
	    return false; 
	neighbor = gr.get(twoNext); 
	if ((neighbor == null) || (neighbor instanceof Flower))
	    return true;
	return false;
    } 
}
