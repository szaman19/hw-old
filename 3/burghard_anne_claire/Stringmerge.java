import java.io.*;
import java.util.*;

public class Stringmerge{

public class Merge{ 

    public ArrayList<String> msort(ArrayList<String a){
	if (a.size()<=1){
	    return a;
	}
	else{
	    ArrayList<String> l1 = split(a,1);
	    ArrayList<String> l2 = split(a,2);
	    l1 = msort(l1);
	    l2 = msort(l2);
	    return merge(l1,l2);
	}
    }


    public ArrayList<String merge(ArrayList<String> a, ArrayList<String> b){
	ArrayList<String> answer = new ArrayList<String>();
	int i = 0;
	int y = 0;
	int z = 0;
	int s = l.size() + r.size();
	while (y< a.size() && z < b.size()){
	    if (y < a.get(y).compareTo(b.get(z)) < 0){
		answer.add(a.get(y));
		y++;
		i++;
	    }
	    else{
		answer.add(b.get(z));
		z++;
		i++;
	    }
	}
	if (z>=b.size()){
	    while (i<s){
		a.add(b.get(y));
		y++;
		i++;
	    }
	}
	else{
	    while(i<s){
		a.add(b.get(z));
		z++;
		i++;
	    }
	}
	return answer;
    }
}
  
    
  
