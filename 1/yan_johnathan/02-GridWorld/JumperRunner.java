import info.gridworld.actor.Rock; 
import info.gridworld.actor.*;  
import info.gridworld.actor.ActorWorld;  
import info.gridworld.actor.Bug; 
import info.gridworld.actor.Flower; 

public class JumperRunner{ 
	public static void main(String[] args){ 
		ActorWorld yan = new ActorWorld(); 
		yan.add(new Jumper()); 
		yan.add(new Rock()); 
		yan.add(new Flower()); 
		yan.add(new Bug()); 
		yan.show(); 
	} 
}