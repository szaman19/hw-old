import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

public class SpiralBugRunner {
    public static void main(String[] args) {
	ActorWorld universe = new ActorWorld();
	SpiralBug spin = new SpiralBug(3);
        universe.add(new Location (5,5), spin);
	universe.show();
    }
}
