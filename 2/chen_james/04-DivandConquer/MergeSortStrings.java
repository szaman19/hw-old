import java.io.*;
import java.util.*;
public class MergeSortStrings {

    //for strings, rewriting using classcode as base

    public static void main(String[] args) {
	MergeSortStrings m = new MergeSortStrings();
	String[] list = {"Chery","Delmar","Tamatha","Josefina","Aldo","Roosevelt","Francis","Anabel","Gina","Rudolph","Nicky","Randolph","Dale","Flor","Ollie","Sherly","Sabrina","Marc","Maryanna","Ellsworth","Jillian","Melina","Amalia","Rossana","Forest","Milagro","Thad","Brittanie","Johnson","Kim","Tammara","Soledad","Alda","Jona","Fred","Josef","Anne","Adriane","Terrance","Mohamed","Annabell","Amos","Marlyn","Latricia","Mike","Lance","Annie","Dusti","Santina","Lamar"};
	System.out.println(Arrays.toString(list));
	
	System.out.println(Arrays.toString(m.msort(list)));
    }
    public String[] merge(String[] a, String[] b) {
	String[] result = new String[a.length+b.length];
	int ia=0,ib=0;
	int i=0;
	while (ia < a.length && ib < b.length) {
	    if (a[ia].compareTo(b[ib])<0) {
		result[i] = a[ia];ia++;
	    }  else {
		result[i] = b[ib];ib++;
	    }
	    i++;
	}

	if (ia >= a.length) {
	    for (;i<result.length;i++){
		result[i] = b[ib];ib++;
	    }
	} else {
	    for (;i < result.length;i++){
		result[i] = a[ia];ia++;
	    }
	}
	return result;
    }

    public String[] msort(String[] L){
	if (L.length<=1) {
	    return L;
	}

	String[] a = new String[L.length/2];
	String[] b = new String[L.length-a.length];
	int i;
	for (i=0;i<a.length;i++) {
	    a[i]=L[i];
	}
	for (;i<L.length;i++){
	    b[ i-a.length] = L[i];
	}	    

	a = msort(a);
	b = msort(b);
	String[] result = merge(a,b);
	return result;
    }

}
