import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.io.*;
import java.util.*;

import java.awt.Color;

public class DancingBugRunner{

	public static void main(String[] args){
	    Random r = new Random();
	    int[] dance = new int[10];
	    for (int i=0;i<dance.length;i++){
		int k=r.nextInt(10);
		dance[i] = k;
	    }

	    ActorWorld world = new ActorWorld();
	    DancingBug emily = new DancingBug(dance);
	    emily.setColor(Color.ORANGE);
	    world.add(new Location(7, 8), emily);
	    world.show();
	}
}
