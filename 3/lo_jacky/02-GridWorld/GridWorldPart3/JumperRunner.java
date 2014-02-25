import info.gridworld.actor.*;

public class JumperRunner 
{ 
    public static void main(String[] args) 
    { 
	ActorWorld world = new ActorWorld();
	for (int i = 0; i < (int)(Math.random() * 5) + 1; i++)
	    world.add(new Jumper());
	for (int i = 0; i < (int)(Math.random() * 10); i++)
	    world.add(new Rock());
	world.show(); 
    } 
} 
