import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class ZBugRunner{
    public static void main(String[] args){
	ActorWorld world = new ActorWorld();
	ZBug zac = new ZBug(4);
	zac.setColor(Color.GREEN);
	world.add(new Location(4,4), zac);
	world.show();
    }
}
