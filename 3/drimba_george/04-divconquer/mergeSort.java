public class mergeSort{
    public static  ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
		int alength = a.size();
		int blength = b.size();
		ArrayList<String> answer = new ArrayList<String>();
		int spota = 0;
		int spotb = 0;
		for(int i=0;spota < alength && spotb < blength;i++){
			if(a.get(spota).compareTo(b.get(spotb)) > 0){
				answer.add(b.get(spotb));
				spotb++;
			}
			else{
				answer.add(a.get(spota));
				spota++;
			}
		}
		for(int i=spota;i<alength;i++){
			answer.add(a.get(i));
		}
		for(int i=spotb;i<blength;i++){
			answer.add(b.get(i));
		}
		return answer;
	}
	public static ArrayList<String> mergeSort(ArrayList<String> L){
		if(L.size() <= 1){
			return L;
		}
		int a = L.size() / 2;
		int b = L.size() - a;
		ArrayList<String> A = new ArrayList<String>();
		ArrayList<String> B = new ArrayList<String>();
		for(int i=0;i<a;i++){
			A.add(L.get(i));
		}
		for(int i=0;i<b;i++){
			B.add(L.get(a+i));
		}
		A = mergeSort(A);
		B = mergeSort(B);
		return merge(A,B);
	}
	public static int find(String s,ArrayList<String> a){
		int start = 0;
		int end = a.size() - 1;
		while(start <= end){
			int mid = (start + end) / 2;
			String val = a.get(mid);
			if(val.equals(s)) return mid;
			else if(val.compareTo(s) < 0) start = mid+1;
			else if(val.compareTo(s) > 0) end = mid-1;
		}
		return -1;
	}
}