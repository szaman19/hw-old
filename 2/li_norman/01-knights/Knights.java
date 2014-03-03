import java.util.ArrayList;

public class Knights
{
    // Instance Variables
    private int _size;                              // Size of Board
    private int _x;                                 // Position (Row)
    private int _y;                                 // Position (Column)
    private int _counter;                           // Counter of Current Step
    private int _type;                              // Current Type of Move
    private int[][] _board;                         // The Chessboard
    private ArrayList<Integer> _pathX;              // Path (Rows)
    private ArrayList<Integer> _pathY;              // Path (Columns)
    private ArrayList<Integer> _types;              // Path (Types of Movement)
 
    // Constructors
    public Knights()
    {
        // Initializing Board and Path 
        _board = new int[5][5];
        _pathX = new ArrayList<Integer>();
        _pathY = new ArrayList<Integer>();
        _types = new ArrayList<Integer>();
        
        // Setting Up Initial Point and Size
        _size = 5;
        _type = 1;
        _x = (int) ( Math.random() * (_size - 1) );
        _y = (int) ( Math.random() * (_size - 1) );
        
        // Adding Initial Point to Path
        _pathX.add(_x);
        _pathY.add(_y);
        _types.add(0);
        
        // Setting Up Counter
        _counter = 1;
        _board[_x][_y] = _counter;
    }
    
    public Knights(int size)
    {
        // Initializing Board and Path 
        _board = new int[size][size];
        _pathX = new ArrayList<Integer>();
        _pathY = new ArrayList<Integer>();
        _types = new ArrayList<Integer>();
        
        // Setting Up Initial Point and Size
        _size = size;
        _type = 1;
        _x = (int) ( Math.random() * (_size - 1) );
        _y = (int) ( Math.random() * (_size - 1) );
        
        // Adding Initial Point to Path
        _pathX.add(_x);
        _pathY.add(_y);
        _types.add(0);
        
        // Setting Up Counter
        _counter = 1;
        _board[_x][_y] = _counter;
    }
    
    // toString() Method
    // Prints the Board
    public String toString()
    {
        String output = new String("");
        
        for (int[] i : _board)
        {
            for (int j : i)
                output += (j + "\t");
            
            output += "\n";
        }
        
        return output;
    }
    
    // Move Method
    private boolean move(int dist_x, int dist_y)
    {
        if (                                                        // Determines whether movement will remain in bounds.
                ( (_x + dist_x >= 0) && (_x + dist_x < _size) ) &&
                ( (_y + dist_y >= 0) && (_y + dist_y < _size) ) &&
                ( _board[_x + dist_x][_y + dist_y] == 0 )
            )
        {
            _x += dist_x;                           // Moves Up/Down Rows (Up/Down)
            _y += dist_y;                           // Moves Left/Right Columns (Left/Right)
            _counter++;                             // Increments Counter
            _board[_x][_y] = _counter;              // Sets Point on Board
            _pathX.add(_x);                         // Adds x-cord to Path
            _pathY.add(_y);                         // Adds y-cord to Path
            _types.add(_type);                      // Adds Type to Path
            _type = 1;                              // Refreshes Type to 1
            return true;
        }
        else
            return false;
    }
    
    // Move Method
    // Various Types of Movement
    private boolean move()
    {
        switch (_type)
        {
            case 1:     // 1 Up, 2 Left
                        return move(-1, -2);
            case 2:     // 1 Down, 2 Left
                        return move(1, -2);
            case 3:     // 1 Up, 2 Right
                        return move(-1, 2);
            case 4:     // 1 Down, 2 Right
                        return move(1, 2);
            case 5:     // 2 Up, 1 Left
                        return move(-2, -1);
            case 6:     // 2 Down, 1 Left
                        return move(2, -1);
            case 7:     // 2 Up, 1 Right
                        return move(-2, 1);
            case 8:     // 2 Down, 1 Right
                        return move(2, 1);
            default:    return false;
        }
    }
    
    // Revert Method
    private void revert()
    {
        _board[_x][_y] = 0;                             // Resets Point back to 0
        _pathX.remove( _pathX.size() - 1 );             // Removes Current Point from Path (x-cord)
        _pathY.remove( _pathY.size() - 1 );             // Removes Current Point from Path (y-cord)
        _type = _types.get( _types.size() - 1 ) + 1;    // Sets Current Type to Start from next Type
        _types.remove( _types.size() - 1 );             // Removes Current Type from Path
        
        if (                                            // In the Event of No Solution...
            ( _pathX.size() == 0 ) ||
            ( _pathY.size() == 0 ) ||
            ( _types.size() == 0 )
           )
           return;
        
        _x = _pathX.get( _pathX.size() - 1 );           // Reverts to Previous Point on Path (x-cord)
        _y = _pathY.get( _pathY.size() - 1 );           // Reverts to Previous Point on Path (y-cord)
        _counter--;                                     // Decrements Counter
        
        if ( _type == 9 )                               // Reverts if all types of movements are attempted, but all fail
            revert();
    }
    
    // Solve Method
    public void solve()
    {
        System.out.println("Before: ");                             // Introductory Message
        System.out.println(this);
    
        process: while ( _counter != (_size * _size) )              // When Counter Reaches Threshold, end the loop
        {
            if (                                                    // If No Solution, break
                ( _pathX.size() == 0 ) ||
                ( _pathY.size() == 0 ) ||
                ( _types.size() == 0 )
               )
               break process;

            // Type 1-7 Move
            for (; _type <= 7; _type++)
            {
                if ( move() )
                    continue process;
            }
            
            // Type 8 Move
            if ( move() )
                continue;
            else
                revert();
        }
        
        if ( _counter == (_size * _size) )                          // End Routine
        {
            System.out.println("After: ");
            System.out.println(this);
        }
        else
            System.out.println("\nSorry. No Solution Found.");
    }
}