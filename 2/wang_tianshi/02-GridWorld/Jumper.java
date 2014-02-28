import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class Jumper extends Bug{
    private int steps;

    public Jumper(){
	setColor(Color.YELLOW);
    }

    public void act(){
        if (canMove()){
            move();
        }
        else{
            turn();
        }
    }

    public void move(){
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
	Location next2= next.getAdjacentLocation(getDirection());
        if (gr.isValid(next2))
            moveTo(next2);
        else
            removeSelfFromGrid();
    }

    public boolean canMove(){
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
	Location next2= next.getAdjacentLocation(getDirection());
        if (!gr.isValid(next2))
            return false;
        Actor neighbor = gr.get(next2);
        return (neighbor == null) || (neighbor instanceof Actor);
    }
}
