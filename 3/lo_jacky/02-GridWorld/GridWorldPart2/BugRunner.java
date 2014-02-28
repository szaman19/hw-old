/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        BoxBug alice = new BoxBug(1);
	CircleBug george = new CircleBug(1);
	SpiralBug bob = new SpiralBug(1);
	ZBug joe = new ZBug(2);
	DancingBug andrew = new DancingBug(100);
        world.add(new Location(1, 1), alice);
	world.add(new Location(2, 2), george);
	world.add(new Location(3, 3), bob);
	world.add(new Location(4, 4), joe);
	world.add(new Location(5, 5), andrew);
        world.show();
    }
}
