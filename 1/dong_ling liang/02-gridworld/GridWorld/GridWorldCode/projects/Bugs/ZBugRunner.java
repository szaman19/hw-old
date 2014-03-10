import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ZBugRunner{
    public static void main(String[] args){
	ActorWorld world = new ActorWorld();
	ZBug pete = new ZBug(3);
	world.add(new Location(4,5), pete);
	world.show();
    }
}
