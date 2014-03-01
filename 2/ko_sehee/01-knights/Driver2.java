public class Driver2{
    public static void main(String[] args){
    knightsTour x = new knightsTour(7);
    x.setUp();
    System.out.print(x);
    x.solve(1,3);
    }
}