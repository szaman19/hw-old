import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

public class JumperRunner {
    public static void main(String[]args) {
	ActorWorld a = new ActorWorld();
	a.add(new Jumper());
	a.add(new Rock());
	a.add(new Flower());
	a.add(new Bug());
	a.show();
    }
}
