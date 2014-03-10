import cs1.Keyboard;

public class KnightsTour {
    private static int size;
    private static int[][] board;
    private static int[][] moves = {{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2}};
    private static String result = "";
    private static int maxMoves;
 
    public static void setSize(int s) {
        size = s;
        board = new int[size][size];
        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++) {
                board[i][j] = -1;
            }
        }
        maxMoves = (size * size)-1;
    }
   
    public static void solve(int move, int x, int y) {
        board[y][x] = move;
        if (move == maxMoves) {
            for (int i=0;i<size;i++) {
                for (int j=0;j<size;j++) {
                    result = result +" "+ board[i][j];
                }
                result = result + "\n";
            }
            System.out.println(result);
            System.exit(0);
 
        }
        else if (move < maxMoves) {
            for (int i=0;i<8;i++) {
                if ((x+moves[i][0]) >= 0 && (x+moves[i][0]) < size && (y+moves[i][1]) >= 0 && (y+moves[i][1]) < size) {
                    if (board[y+moves[i][1]][x+moves[i][0]] == -1) {
                        solve(move +1, x+moves[i][0], y+moves[i][1]);
                    }
                }
            }
        }
        board[y][x] = -1;
    }
 
    public static void main(String[] args) {
        System.out.print("Type in your board size: ");
        int x=Keyboard.readInt();
        setSize(x);
        solve(0,0,0);
    }
}