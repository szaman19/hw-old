import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;

public class Jumper extends Actor{
    
    public Jumper(){
	setColor(Color.magenta);
    }

    public Jumper(Color rainbow){
	setColor(rainbow);
    }

    public void turn(){
	setDirection(getDirection() + Location.HALF_RIGHT);
    }
    
    public void jump(){
	Grid<Actor> gr = getGrid();
	if(gr == null) return;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	Location twoStep = next.getAdjacentLocation(getDirection());
	if(gr.isValid(twoStep)) moveTo(twoStep);
	else removeSelfFromGrid();
    }
    
    public boolean canJump(){
	Grid<Actor> gr = getGrid();
	if(gr == null) return false;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	if(!gr.isValid(next)) return false;
	Actor neighbor = gr.get(next);
	if(!((neighbor instanceof Flower) ||
	     (neighbor instanceof Rock) ||
	     (neighbor == null)))
	    return false;
	Location twoStep = next.getAdjacentLocation(getDirection());
	if(!gr.isValid(twoStep)) return false;
	neighbor = gr.get(twoStep);
	return (neighbor instanceof Flower) || (neighbor == null);
    }
    
    public void act(){
	if(canJump())
	    jump();
	else
	    turn();
    }
}
