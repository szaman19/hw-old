import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CircleBugRunner{

    public static void main(String[] args){
	ActorWorld world = new ActorWorld();
	CircleBug one = new CircleBug(2);
	one.setColor(Color.ORANGE);
	world.add(new Location(3,4), one);
	world.show();
    }

}