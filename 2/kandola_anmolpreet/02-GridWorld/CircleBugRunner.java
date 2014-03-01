import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class CircleBugRunner {
    public static void main(String[] args) {
	ActorWorld player = new ActorWorld();
	CircleBug round = new CircleBug(3);
	round.setColor(Color.GREEN);
        player.add(new Location (5,5), round);
	player.show();
    }
}
