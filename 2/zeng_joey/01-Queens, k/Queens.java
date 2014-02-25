import java.util.ArrayList;

public class Queens{
    private String[] board;
    private int count;
    private int en;
    private boolean solved;
    private ArrayList<Integer> taken;
    
    public Queens(int n){
	board = new String[n*n];
	for(int i = 0; i < n*n; i++){
	    board[i] = "-";
	}
	count = 0;
	en = n;
	taken = new ArrayList<Integer>();
    }

    public String toString(){
	String s = "";
	for(int r = 0; r < en; r++){
	    for(int c = 0; c < en; c++){
		s+= " " + board[r*en + c];
	    }
	    s+= "\n";
	}
	return s;
    }
    
    public void delay(int i){
	try{
	    Thread.sleep(i);
	}
	catch(InterruptedException e){
	    System.exit(0);
	}
    }


    public void calc(int i, String s){
	ArrayList<Integer> ret = new ArrayList<Integer>();
	int a = i % en;
	for (int x = 0; x < en; x++){
	    ret.add(a+en*x);
	}
	int b = i / en;
	for (int x = 0; x < en; x++){
	    ret.add(b*en+x);
	}
	for (int x = 0; x < en; x++){ // NW
	    if ((i-x*(en+1))%en == 0 || (i-x*(en+1)) < en){
		ret.add(i-x*(en+1));
		break;
	    }
	    else
		ret.add(i-x*(en+1));
	}
	for (int x = 0; x < en; x++){ // SE
	    if ((i+x*(en+1))%en == (en-1) || (i+x*(en+1)) > en*(en-1)-1){
		ret.add(i+x*(en+1));
		break;
	    }
	    else
		ret.add(i+x*(en+1));
	}
	for (int x = 0; x < en; x++){ // NE
	    if ((i-x*(en-1))%en == en-1 || (i-x*(en-1)) < en){
		ret.add(i-x*(en-1));
		break;
	    }
	    else
		ret.add(i-x*(en-1));
	}
	for (int x = 0; x < en; x++){ // NW
	    if ((i+x*(en-1))%en == 0 || (i+x*(en-1)) > en*(en-1)-1){
		ret.add(i+x*(en-1));
		break;
	    }
	    else
		ret.add(i+x*(en-1));
	}

	//	System.out.println(ret);
	for(int as:ret){

	    board[as] = s;
	}
	
    }
    

    public void solve(int i){
	System.out.println(this);
	delay(100);
	if(count == en){
	    solved = true;
	    return;
	}
	else if(board[i] == "-"){
	    
	    count++;
	    calc(i,"*");
	    taken.add(i);
	    board[i] = "Q";
	    solve(count*en);
	    for (int aaa = 1; aaa < en; aaa++){
		if(!solved)
		    solve(count*en + aaa);
	    }
	    calc(i,"-");
	    taken.remove(taken.indexOf(i));
	    for(int q:taken){
		calc(q,"*");
	    }
	    for(int q:taken){
		board[q]="Q";
	    }
	    board[i] = "0";
	    while(i % en > 0){
		i--;
		board[i] = "0";
	    }
	    count--; 
	    
	}
	else
	    board[i] = "0";
    }

    public static void main(String[] args){
	int i = 8;
	for(int a = 0; a < i; a++){
	    Queens q = new Queens(i);
	    q.solve(a);
	    if(q.solved)
		break;
	}
    }
}
