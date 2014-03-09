import java.util.*;
import java.io.*;

public class MergeSort{
	//public static int[] data; 
	public static ArrayList<String> data;  
	

	public static ArrayList<String> mergeSort(ArrayList<String> data){
		int x = data.size();
		ArrayList<String> a,b;
		if (data.size() % 2 == 0) {
			a = new ArrayList<String>(data.size() / 2); //[data.size() / 2];
			b = new ArrayList<String>(data.size() / 2); //[data.size() / 2]; 
		}
		else{
			a = new ArrayList<String>((data.size() / 2) + 1); //[(data.size() / 2) + 1];
			b = new ArrayList<String>(data.size() / 2); //[data.size() / 2]; 
		}

		if (x <= 1) {
			return data;
		}
		else{
			int counter = 0;
			for (int i = 0; i < a.size(); i++) {
				a.set(i) = data.get(i);
				counter++;
			}
			for (int q = 0; q < b.length; q++) {
				b.set(q) = data.get(counter + q);
			}return merge(mergeSort(a), mergeSort(b));

		}
	}

	public static ArrayList<String> merge(int [] a, int [] b){
		//int [] answer = new int[a.length + b.length];
		ArrayList<String> answer = new ArrayList<String>(a.size() + b.size());
		int i = 0, j = 0, k = 0;

    while (i < a.size() && j < b.size())
    {
        if ((a.get(i).compareTo( b.get(j))) > 0)       
            answer.set(k++) = a.get(i++);

        else{        
            answer.set(k++) = b.get(j++);               
    	}
    }

    while (i < a.size())  
        answer.set(k++) = a.set(i++);


    while (j < b.size())    
        answer.set(k++) = b.set(j++);

    return answer;
    

}
public static int [] Insertion(int[] data){
    /*put in your code*/
       for (int i = 0; i < data.length; i++) {
         for (int j = i; j > 0; j--) {
            if (data[j-1] > data[j]) {
               int temp = data[j];
               data[j] = data[j-1];
               data[j-1] = temp;
            }
         }
      }
      return data;
    }
	

	public static void main(String[] args) {

		int [] data = new int [1000]; //test Array 
		//for (int x = 0; x < data.length; x++) {
		//	data[x] = (int) (Math.random() * 100000 + 1); 
	//}

/*		
long startTime = System.currentTimeMillis();
int [] ans = mergeSort(data);
long endTime   = System.currentTimeMillis();
long totalTime = endTime - startTime;

long start = System.currentTimeMillis();
int [] anss = Insertion(data);
long end = System.currentTimeMillis() - start;

System.out.println("MergeSort Time: " + totalTime);
System.out.println("Insertion Time: " + end);
		
		//for (int i = 0; i < data.length; i++) {
		//	System.out.println(ans[i]);
		//}
	} */
}}