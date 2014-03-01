import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ZBugRunner {
    public static void main(String[] args) {
	ActorWorld chooser = new ActorWorld();
	ZBug z = new ZBug(3);
        chooser.add(new Location (5,5), z);
	chooser.show();
    }
}
