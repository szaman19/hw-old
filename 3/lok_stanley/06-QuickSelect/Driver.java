public class Driver{

    public static void main(String[]args){
	
	QuickSelect quick = new QuickSelect();

	int [] test = {1,5,2,3,6,51,23,12,432};

	System.out.println(quick.quickselect(test,0));
	System.out.println(quick.quickselect(test,1));
	System.out.println(quick.quickselect(test,2));
	System.out.println(quick.quickselect(test,3));
	System.out.println(quick.quickselect(test,4));
	System.out.println(quick.quickselect(test,5));
	System.out.println(quick.quickselect(test,6));
	System.out.println(quick.quickselect(test,7));
	System.out.println(quick.quickselect(test,8));
	
	}
}