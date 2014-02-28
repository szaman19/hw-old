import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class Jumper extends Actor {

    public Jumper() {
	setColor(Color.GREEN);
    }

    public Jumper(Color c) {
	setColor(c);
    }

    public void act() {
	if (canJump())
	    jump();
	else 
	    turn();
    }

    public void jump() {
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	Location ahead = next.getAdjacentLocation(getDirection());
	if (gr.isValid(ahead))
	    moveTo(ahead);
	else
	    removeSelfFromGrid();
    }

    public boolean canJump() {
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return false;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	if (!gr.isValid(next)) //on edge
	    return false;

	Actor neighbor = gr.get(next);
	if (! ( (neighbor == null) || (neighbor instanceof Flower) ||
		(neighbor instanceof Rock) ) ) 
	    //if tile is not empty, has something other than a flower or rock   
	    return false;
	Location ahead = next.getAdjacentLocation(getDirection());
	if (!gr.isValid(ahead))
	    return false;

	neighbor = gr.get(ahead);
	return (neighbor == null) || (neighbor instanceof Flower);
    }

    public void turn() {
	setDirection(getDirection() + 45);
    }
}
