import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class Jumper extends Bug
{

    public Jumper()
    {
	setColor(Color.PINK);
    }

    public boolean canJump() {
	Grid<Actor> gr = getGrid();
	if (gr == null)
	    return false;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	if (!gr.isValid(next))
	    return false;
	Actor neighbor = gr.get(next);
	return (neighbor == null) || (neighbor instanceof Flower);
    }

    public Jumper(Color JumperColor)
    {
	setColor(JumperColor);
    }
    public void act()
    {
	if (canJump())
	    jump();
	else
	    turn();
    }

    public void turn()
    {
	setDirection(getDirection() + Location.HALF_RIGHT);
    }
	public void jump()
    {
	Grid<Actor> foo = getGrid();
	if (foo == null)
	    return;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	Location twoAway = next.getAdjacentLocation(getDirection());
	if (foo.isValid(twoAway))
	    moveTo(twoAway);
	else
	    removeSelfFromGrid();
    }

    public boolean canJump()
    {
	Grid<Actor> foo = getGrid();
	if (foo == null)
	    return false;
	Location loc = getLocation();
	Location next = loc.getAdjacentLocation(getDirection());
	if (!foo.isValid(next))
	    return false;
	Actor neighbor = foo.get(next);
	if (!((neighbor == null) || (neighbor instanceof Flower)
	      || (neighbor instanceof Rock)))
	    return false;
	Location twoAway = next.getAdjacentLocation(getDirection());
	if (!foo.isValid(twoAway))
	    return false;
	neighbor = foo.get(twoAway);
	return (neighbor == null) || (neighbor instanceof Flower);
    }
}
