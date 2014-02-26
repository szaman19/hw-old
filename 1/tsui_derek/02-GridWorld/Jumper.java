import info.gridworld.actor.*;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid; 

public class Jumper extends Bug
{

    public Jumper()
    {
    
    }

    public void move(){
    	Grid<Actor> gr = getGrid();
    	if (gr == null) return; 
		Location loc = getLocation(); 
		Location next = loc.getAdjacentLocation(getDirection());
		Location next2 = next.getAdjacentLocation(getDirection());
		if (gr.isValid(next2)) moveTo(next2); 
		else removeSelfFromGrid(); 
    }
    
    public boolean canMove(){
		Grid<Actor> gr = getGrid(); 
		if (gr == null) return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location next2 = next.getAdjacentLocation(getDirection());
		if (!gr.isValid(next2)) return false;
		Actor neighbor = gr.get(next2);
		return (neighbor == null) || (neighbor instanceof Flower) || !(neighbor instanceof Jumper);    
    }
    public void turn(){
		setDirection(getDirection() + Location.HALF_RIGHT);
	}
    
    public void act()
    {
        if (canMove())
        {
            move();
        }
        else
        {
            turn();
        }
    }
}
