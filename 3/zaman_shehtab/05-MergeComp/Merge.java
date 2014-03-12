import java.util.*;
import java.io.*;

public class Merge implements Object{
public static ArrayList<Object> data; 

public static ArrayList<Object> mergeSort(ArrayList<Object> data){
		int x = data.size();
		ArrayList<Object> a,b;
		if (data.size() % 2 == 0) {
			a = new ArrayList<Object>(data.size() / 2); 
			b = new ArrayList<Object>(data.size() / 2); 
		}
		else{
			a = new ArrayList<Object>((data.size() / 2) + 1); 
			b = new ArrayList<Object>(data.size() / 2); 
		}

		if (x <= 1) {
			return data;
		}
		else{
			int counter = 0;
			for (int i = 0; i < a.size(); i++) {
				a.set(i, data.get(i));
				counter++;
			}
			for (int q = 0; q < b.size(); q++) {
				b.set(q, data.get(counter + q));
			}return merge(mergeSort(a), mergeSort(b));

		}
	}
public static ArrayList<Object> merge(ArrayList<Object> a, ArrayList<Object> b){
		
		ArrayList<Object> answer = new ArrayList<Object>(a.size() + b.size());
		int i = 0, j = 0, k = 0;
if (a.instanceof(person)) {
	

    while (i < a.size() && j < b.size())
    {
        if ((a.get(i).compareTo( b.get(j))) > 0)       
            answer.set(k++, a.get(i++));

        else{        
            answer.set(k++,b.get(j++));               
    	}
    }

    while (i < a.size())  
        answer.set(k++, a.get(i++));


    while (j < b.size())    
        answer.set(k++, b.get(j++));

    return answer;
    }

}
}