import info.gridworld.actor.ActorWorld;

public class CircleBugRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		CircleBug alice = new CircleBug(5);
		world.add(alice);
		world.show();
	}
}
