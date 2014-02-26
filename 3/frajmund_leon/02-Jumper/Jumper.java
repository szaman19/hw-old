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
	    //I cannot for the life of me get isValid to work, even if it is
	    //a Grid function and I have Grid imported
	    //Apparently nobody else that I asked knew how to do it too so I am
	    //stumped
	    moveTo(target);
	}else
	    turn();
    }
    
    public Location newTarget(){
	return getLocation().getAdjacentLocation(getDirection()).
	    getAdjacentLocation(getDirection());
    }
    
}
