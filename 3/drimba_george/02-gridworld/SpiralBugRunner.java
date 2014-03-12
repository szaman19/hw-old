import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class SpiralBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpiralBug test = new SpiralBug(1);
        test.setColor(Color.ORANGE);
        world.add(new Location(5, 5), test);
        world.show();
    }
}
