import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

public class JumperRunner{
  public static void main(String[]args){
    ActorWorld n = new ActorWorld();
    n.add(new Jumper());
    n.add(new Rock());
    n.add(new Bug());
    n.add(new Flower());
    n.show();
  }
}
