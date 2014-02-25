import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class Jumper extends Bug{
    private Location target;

    public Jumper(){
	target = new Location(0, 0);
    }
    
    public void act(){
	target = newTarget();
	if (get(target) != null && isValid(target)){
	    moveTo(target);
	}else
	    turn();
    }
    
    public Location newTarget(){
	return getLocation().getAdjacentLocation(getDirection()).
	    getAdjacentLocation(getDirection());
    }
    
}
