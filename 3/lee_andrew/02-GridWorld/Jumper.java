import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class Jumper extends Actor {
    public Jumper(){
	setColor(Color.BLUE);
    }

    public Jumper(Color c){
	setColor(c);
    }

    public void turn(){
	setDirection(getDirection() + 45);
    }

    public void move(){
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	Location two = next.getAdjacentLocation(getDirection());
	if (gr.isValid(two))
	    moveTo(two);
	else
	    removeSelfFromGrid();
    }

    public boolean canMove(){
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return false;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	if (!gr.isValid(next))
	    return false;
	Actor neighbor = gr.get(next);
	if (!((neighbor == null) || (neighbor instanceof Flower) || (neighbor instanceof Rock)))
	    return false;
	Location two = next.getAdjacentLocation(getDirection());
	if (!gr.isValid(two))
	    return false;
	neighbor = gr.get(two);
	return (neighbor == null) || (neighbor instanceof Flower);
    }
    
    public void act(){
	if (canMove())
	    move();
	else
	    turn();
    }
}
