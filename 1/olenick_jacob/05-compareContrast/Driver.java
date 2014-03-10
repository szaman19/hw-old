import java.io.*;
import java.util.*;


public class Driver{

    public static void main(String[] args){
	Sort S = new Sort();
	ArrayList<Integer> test1 = randArrayList(20,1000,0);
	ArrayList<String> test2 = randArrayList(20,5,"");
	ArrayList<Person> test3 = randArrayList(10);
	System.out.println(test1);
	System.out.println(test2);
	test1 = S.mergeSort(test1);
	test2 = S.mergeSort(test2);
	System.out.println(test1);
	System.out.println(test2);
	System.out.println(test3);
	test3 = S.mergeSort(test3);
	System.out.println(test3);


	Seeker search = new Seeker();
	int[] test4 = {1,2,3,4,4,5,6,9,11};
	System.out.println(search.rbsearch(5,test4,0,0));
	System.out.println(search.ibsearch(5,test4,0,0));
    }

    public static ArrayList<Person> randArrayList(int size){
	ArrayList result = new ArrayList<Person>();
	for(int i = 0;i<size;i++){
	    result.add(new Person());
	}
	return result;
    }

    public static ArrayList<Integer> randArrayList(int size, int range, int indicator){
	Random r = new Random();
	ArrayList<Integer> result = new ArrayList<Integer>(size);
	for (int i = 0; i < size; i++){
	    result.add(r.nextInt(range));
	}
	return result;
    }

    public static ArrayList<String> randArrayList(int size, int wordLength, String indicator){
	Random r = new Random();
	ArrayList<String> result = new ArrayList<String>(size);
	String word = "";
	for (int i = 0; i < size; i++){
	    for (int j = 0; j < wordLength; j++){
		word = word + (char)(r.nextInt(26) + 97);
	    }
	    result.add(word);
	    word = "";
	}
	return result;
    }

    public static int[] randArray(int size, int range, int indicator){
	Random r = new Random();
	int[] result = new int[size];
	for (int i = 0; i < size; i++){
	    result[i] = r.nextInt(range);
	}
	return result;
    }
    
    public static String[] randArray(int size, int wordLength, String indicator){
	Random r = new Random();
	String[] result = new String[size];
	String word = "";
	for (int i = 0; i < size; i++){
	    for (int j = 0; j < wordLength; j++){
		word = word + (char)(r.nextInt(26) + 97);
	    }
	    result[i] = word;
	    word = "";
	}
	return result;
    }

}