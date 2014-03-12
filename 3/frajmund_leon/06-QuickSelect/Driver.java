public class Driver{

    public static void main(String[]args){

	int[] a = {5,12,7,3,8,2,3};
	QuickSelect b = new QuickSelect();
	System.out.println(b.quickSelect(a, 5));
    }

    //bug in which sometimes it substitutes a 0 for a value, 
    //thus messing it up and giving the wrong answer.
    //No clue what causes nor how to fix

}
