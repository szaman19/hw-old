/*public static void main(String[] args){
    Merge x = new Merge(sort);
	    a = (1, 2, 3, 4, 5);
	    b = (1, 2, 3, 4, 5);
	    x.sort (a,b);
}
*/

public class Driver {
    public static void main(String[] args) {
        Split split = new Split();
        int[] c = new int[10];
        int i = 0;
        while (i < 10) {
            c[i] = i;
            i++;
        }
        split.split(c);
    }
}
