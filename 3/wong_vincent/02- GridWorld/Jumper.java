import info.gridworld.actor.Bug;

public class Jumper extends Bug {

    public void move(){
	Grid<Actor> grid = getGrid();
	
	if(grid == null){
	    return;
	}
	
	Location loc = getLocation();
	loc = loc.getAdjacentLocation(getDirection());
	loc = loc.getAdjacentLocation(getDirection());
	
	if(grid.isValid(loc)){
	    moveTo(loc);
	}
	else{
	    removeSelfFromGrid();
	}
	
    }
}
