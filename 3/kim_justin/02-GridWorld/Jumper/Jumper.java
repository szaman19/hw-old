import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Jumper extends Bug
{

    /**
     * Constructs a jumper
     */
    public Jumper()
    {
    }

    public void act()
    {
        if (canMove()) {
            move();
        } else {
            turn();
            turn();
        }
    }

    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbour = gr.get(next);
        return neighbour == null;
    }

    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
        if (gr.isValid(next)) {
            moveTo(next);
        } else {
            removeSelfFromGrid();
        }
    }
}
