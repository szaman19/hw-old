public class Split{

    private int[] a = new int[5];
    private int[] b = new int[5];
    private int[] c = new int[10];

    public void split(int[] c){
        for (int i = 0; i <= c.length; i++){
            int x = 0;
            if (c.length % 2 == 0){
		if (i < c.length/2-1){
		    a[i]=c[i];
		}
		if (i > c.length/2){
		    b[x]=c[i];
		    x++;
		}
            }
            if (c.length % 2 == 1){
		if(i < c.length+1 / 2){
		    a[i] = c[i];
		}
		if (i > c.length+1 / 2){
		    b[x] = c[i];
		    x++;
		}
            }
        }
	for (int i = 0; i < a.length; i++) {
	    System.out.println(a[i]);
	}
	for (int i = 0; i < b.length; i++) {
	    System.out.println(b[i]);

	}
    }
}
