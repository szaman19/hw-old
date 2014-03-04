import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
public class Jumper{
    public static void main(String[]args){
        ActorWorld world = new ActorWorld();
        Jumper a = new Jumper();
        world.add(new Location(5,5),a);
        world.show;
    }
}
