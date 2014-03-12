import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
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
	if ( moveable() = true ) 
	    jump();
	else 
	    turn();
    }

    public void turn() {
	setDirection(getDirection() + Location.HALF_RIGHT);
    }

    public void jump() {
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	Location hop = next.getAdjacentLocation(getDirection());
	if (gr.isValid(hop))
	    moveTo(hop);
	else
	    removeSelfFromGrid();
	Flower daisy = new Flower(getColor());
	flower.putSelfInGrid(gr, hop);
    }

    public boolean moveable() {
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return false;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	Location hop = next.getAdjacentLocation(getDirection());
	if (!gr.isValid(hop))
	    return false;
	Actor neighbor = gr.get(hop);
	return (neighbor == null) || (neighbor instanceof Flower);
    }

}
