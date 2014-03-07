public class BinarySearch{
    
    public static void RecursiveSearch(int[] A, int looking){
	if (A.length / 2 == looking){
	    System.out.println(looking);
	    System.out.println("You have found the answer");
	}
	if (A.length / 2 < looking){
	    
	}
	if (A.length / 2 > looking){
	    
	}
	
    }
	
    public static void LoopingSearch(int[] A, int looking){
	
    }
    
    public static void main(String[] args){
	
	int[] array = new int[10];
	for (int i = 0;i<array.length;i++){
	    array[i] = i;
	}
	
	BinarySearch.RecursiveSearch(array,9);
	BinarySearch.LoopingSearch(array,9);
    }
}