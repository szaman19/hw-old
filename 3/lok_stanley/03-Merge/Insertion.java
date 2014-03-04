public class Insertion{

    public void Insertion(int[]data){
	
	for(int i = 1; i < data.length; i++){
	    for(int j = 0; j < i; j++){
		if(data[i] < data[j]){
		    int temp = data[i];
		    for(int k = i; k > j; k--){
			data[k] = data[k - 1];
		    }
		    data[j] = temp;
		}
	    }
	}
    }
}