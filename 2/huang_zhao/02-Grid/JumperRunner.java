import info.gridworld.actor.ActorWorld;



public class JumperRunner
{
public static void main(String[] args)
{
ActorWorld world = new ActorWorld();
world.add(new Jumper());
world.add(new Rock());
world.add(new Bug());
world.add(new Flower());
world.show();
}
}