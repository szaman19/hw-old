import java.awt.Color;

import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class DropWorld extends World<Piece>
{
   private DropGame game;
   private Color currentColor;
   private boolean gameOver;
   
   public static void main(String[] args)
   {
      DropWorld world = new DropWorld(4, 6);
      world.show();
   }
   
   public DropWorld(int rows, int cols)
   {
      super(new BoundedGrid<Piece>(rows, cols));
      game = new DropGame(getGrid());
      currentColor = Color.WHITE;
      flipTurn();
   }

   public void flipTurn()
   {
      if (currentColor.equals(Color.WHITE))
      {
         currentColor = Color.BLACK;
         setMessage("Black's turn");
      }
      else
      {
         currentColor = Color.WHITE;
         setMessage("White's turn");
      }         
   }
   
   @Override
   public boolean locationClicked(Location loc)
   {
      if (gameOver) return false;
      Location dropLoc = game.dropLocationForColumn(loc.getCol());
      if (dropLoc == null) 
         setMessage("Illegal drop location, try again");
      else
      {
         if (game.dropMatchesNeighbors(loc.getCol(), currentColor))
         {
            setMessage("Congratulations--you won");
            gameOver = true;
         }
         getGrid().put(dropLoc, new Piece(currentColor));
      }
      if (!gameOver) flipTurn();
      return true;
   }     
}
