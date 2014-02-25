class NQueens
{
    private char[][] board;
    private int width, height, currMove, maxMoves;
    private final char QUEEN = 'Q';
    private final char TILE = 'x';
    private boolean solved = false;
    private int[][] placements;

    public NQueens(int width, int height)
    {
        board = new char[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                board[i][j] = 'x';
            }
        }

        this.width = width;
        this.height = height;
        currMove = 1;
        maxMoves = height;

        placements = new int[maxMoves][2];
    }

    public String toString()
    {
        // String s = "[0;0H";
        String s = "";

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                s += board[i][j] + " ";
            }

            s += "\n";
        }
        return s;
    }

    private void delay(int n)
    {
        try{
            Thread.sleep(n);
        }catch (InterruptedException e) {
            System.out.println("Interrupt..");
            System.exit(0);
        }
    }

    private String padNumber(int n)
    {
        int length = String.valueOf(n).length();
        int maxLength = String.valueOf(maxMoves).length();

        if (length < maxLength) {
            String s = "";
            int diff = maxLength - length;
            for (int i = 0; i < diff; i++) {
                s = "0" + s;
            }
            return s + n;
        } else {
            return "" + n;
        }
    }

    private boolean validateSafety(int x, int y)
    {
        if (x < 0 || y < 0)
            return false;

        if (x >= width || y >= height)
            return false;

        // try {
        //     return board[x][y] == TILE;
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     return false;
        // }

        for (int i = 0; i < currMove -1; i++) {
            int ox = placements[i][0];
            int oy = placements[i][1];
            if (ox == x || oy == y || Math.abs(ox - x) == Math.abs(oy - y))
                return false;
        }

        return true;
    }


    public void solve(int x, int y)
    {
        delay(50);

        if (!validateSafety(x, y)) {
            return;
        }

        if (currMove == maxMoves) {
            solved = true;
            board[x][y] = QUEEN;
            placements[currMove-1] = new int[]{x, y};
            System.out.println(this);
            System.out.println("We solved it!");
            return;
        } else {
            board[x][y] = QUEEN;
            placements[currMove-1] = new int[]{x, y};
            currMove++;

            solve(0, y + 1);
            for (int i = 1; i < height; i++) {
                if (!solved) {
                    if (i != y)
                        solve(i, y + 1);
                }
            }

            if (!solved) {
                board[x][y] = TILE;
                currMove--;
                placements[currMove-1] = null;
            }
        }
    }


    public static void main(String[] args)
    {
        NQueens nq = new NQueens(5, 5);

        System.out.println("[2J");
        nq.solve(2, 0);

    }

}

