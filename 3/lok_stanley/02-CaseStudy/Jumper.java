import info.gridworld.actor.Bug;

public class Jumper extends Bug{

    public Jumper(){
	super();
    }

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

    public boolean canMove(){
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return false;
	Location loc = getLocation();
	loc = loc.getAdjacentLocation(getDirection());
	Location next = loc.getAdjacentLocation(getDirection());
	if (!gr.isValid(next))
	    return false;
	Actor neighbor = gr.get(next); 
	return (neighbor == null) || (neighbor instanceof Flower); 
    }
}