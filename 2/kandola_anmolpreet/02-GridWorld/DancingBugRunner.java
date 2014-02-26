import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public static void main(String[] args) {
    ActorWorld galaxy = new ActorWorld();
    int[] turns = {2, 5, 3, 1};
    DancingBug dancer = new DancingBug(turns);
    dancer.setColor(Color.GREEN);
    galaxy.add(new Location(5, 5), dancer);
    galaxy.show();
}
    
