public class Tour{

        private int[][]board;
        private int current = 1;
        private boolean solved = false;


        public Tour(){
                board = new int[8][8];
        }

        public String toString(){
                for (int rows = 0; rows < 8; rows++){
                        for (int col = 0; col < 8; col++){
                                System.out.print(board[rows][col]);
                                System.out.print(" ");
                        }System.out.println("\n");
                }return "";
        }

        public boolean inBounds(int nx, int ny){
                return (nx < 8 && nx >= 0 && ny < 8 && ny >= 0);
        }

        public void solve(int x, int y){
                if (!solved && board[x][y] == 0){
                        board[x][y] = current;
                        current +=1;
                        if (current == 65){
                                System.out.println(this.toString());
                                solved = true;
                        }if (!solved){
                                if (inBounds(x-2, y-1) && board[x-2][y-1] == 0){
                                        solve(x-2, y-1);
                                }
                        }if (!solved){
                                if (inBounds(x-1, y+2) && board[x-1][y+2] == 0){
                                        solve(x-1, y+2);
                                }
                        }if (!solved){
                                if (inBounds(x-2, y+1) && board[x-2][y+1] == 0){
                                        solve(x-2, y+1);
                                }
                        }if (!solved){
                                if (inBounds(x+1, y+2) && board[x+1][y+2] == 0){
                                        solve(x+1, y+2);
                                }
                        }if (!solved){
                                if (inBounds(x+2, y+1) && board[x+2][y+1] == 0){
                                        solve(x+2, y+1);
                                }
                        }if (!solved){
                                if (inBounds(x-1, y-2) && board[x-1][y-2] == 0){
                                        solve(x-1, y-2);
 }
                        }if (!solved){
                                if (inBounds(x+2, y-1) && board[x+2][y-1] == 0){
                                        solve(x+2, y-1);
                                }
                        }if (!solved){
                                if (inBounds(x+1, y-2) && board[x+1][y-2] == 0){
                                        solve(x+1, y-2);
                                }
                        }board[x][y] = 0;
                        current -= 1;
                }

        }
        public static void main(String[] args){
                Tour k = new Tour();
                k.solve(0,0);
        }

}

