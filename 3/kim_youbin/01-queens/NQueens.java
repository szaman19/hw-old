public class NQueens{
    private char[][] data;
    private boolean solved;
    private int n;
    private int qcount;

    public NQueens(int a){
	n = a;
	qcount = 0;
	data = new char[n][n];
	for (int i = 0; i < n; i++){
	    for (int j = 0; j < n; j++){
		data[i][j] = '-';
	    }
	}
	solved = false;
    }

    public void solve(int x, int y){
	if (solved){
	    return;
	}else if (x >= n || x < 0 || y >= n || y < 0){
	    return;
	}else if (conflict(x,y)){
	    return;		
	}else{
	    data[x][y] = 'Q';
	    qcount++;
	    if (qcount == n){
		solved = true;
	    }
	    System.out.println(this);
	    for (int i = 0; i < n; i++){
		solve(x+1,i);
	    }
	    if(!solved){
		qcount--;
		data[x][y] = '-';
	    }
	}
    }
    
    private boolean conflict(int x, int y){
	for (int i = 0; i < n; i++){
	    if(data[i][y] == 'Q'){
		return true;
	    }
	    try{
		if(data[x-i-1][y-i-1] == 'Q'){
		    return true;
		}
	    }catch(ArrayIndexOutOfBoundsException e){
	    }
	    try{
		if(data[x-i-1][y+i+1] == 'Q'){
		    return true;
		}
	    }catch(ArrayIndexOutOfBoundsException e){
	    }
	} 
	return false;
    }

    public String toString(){
	String ans = "";
	for (int i = 0; i < n; i++){
	    for (int j = 0; j < n; j++){
		ans += data[i][j];
		ans += " ";
	    }
	    ans += "\n";
	}
	return ans;
    }
    
    public static void main(String[] args){
	int b = Integer.parseInt(args[0]);
	NQueens a = new NQueens(b);
	for (int i = 0; i < b; i++){
	    a.solve(0,i);
	}
    }

}

