public class JumpRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Jumper hopkins  = new Jumper();
	Jumper poppy = new Jumper();
        world.add(new Location(1, 1), hopkins);
        world.add(new Location(3, 7), poppy);
        world.show();
    }
}
