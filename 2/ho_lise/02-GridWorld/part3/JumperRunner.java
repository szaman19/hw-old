import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import java.awt.Color;

public class JumperRunner{
 
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
	Jumper alice = new Jumper(Color.ORANGE);
	
	Jumper bob = new Jumper();
	bob.setColor(Color.RED);
	Rock liz = new Rock();
	Rock mary = new Rock();
	Rock bill = new Rock();
       
	Flower jim = new Flower();
	Flower amy = new Flower();
	Flower tim = new Flower();

       
	world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.add(new Location(5, 7), tim);
        world.add(new Location(7, 5), amy);
        world.add(new Location(4, 5), jim);
        world.add(new Location(6, 7), bill);
	world.add(new Location(4, 8), mary);
	world.add(new Location(8, 7), liz);

        world.show();
    }
}