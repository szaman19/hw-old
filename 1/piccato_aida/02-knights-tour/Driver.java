
public class Driver {
    public static void main(String[] args) {
	KnightsTour game = new KnightsTour(5);
	System.out.println("[2J");
	System.out.println(game);
	game.solve(5,5);
	System.out.println(game.getIterations());
    }
}
