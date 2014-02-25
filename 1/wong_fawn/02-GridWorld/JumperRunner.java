import info.gridworld.actor.ActorWorld; 
import info.gridworld.actor.Bug; 
import info.gridworld.actor.Rock; 
import info.gridworld.actor.Flower; 

public class JumperRunner { 
	public static void main(String[] args) { 
		ActorWorld w = new ActorWorld(); 
		w.add(new Jumper()); 
		w.add(new Bug()); 
		w.add(new Flower()); 
		w.add(new Rock()); 
		w.show(); 
	} 
}