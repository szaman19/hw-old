public class InsertionTest{

    public static void main(String[]args){

	Insertion insertiona = new Insertion();

	int[]test = new int[100000];
	
	for(int i = 0; i < test.length; i++){
	    test[i] = (int)(Math.random() * 10000);
	}

	insertiona.Insertion(test);
    }
}