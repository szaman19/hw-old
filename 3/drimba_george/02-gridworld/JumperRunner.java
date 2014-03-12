import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class JumperRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Jumper test = new Jumper();
        test.setColor(Color.ORANGE);
        world.add(new Location(5, 5), test);
        world.show();
    }
}
