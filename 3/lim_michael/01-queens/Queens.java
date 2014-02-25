import java.io.*;
import java.util.*;

public class Queens {
    public boolean canPlace(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if ((q[i] == q[n]) || ((q[i] - q[n]) == (n - i)) || ((q[n] - q[i]) == (n - i)))
                return false;
        }
        return true;
    }

    public void print(int[] q) {
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q.length; j++) {
                if (q[i] == j) 
                    System.out.print("Q ");
                else           
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
    }

    public void toSolve(int k) {
        int[] a = new int[k];
        toSolve(a, 0);
    }

    public void toSolve(int[] q, int n) {
        if (n == q.length) 
            print(q);
        else {
            for (int i = 0; i < q.length; i++) {
                q[n] = i;
                if (canPlace(q, n)) 
                    toSolve(q, n+1);
            }   
        }
    }  


    public static void main(String[] args) {
        Queens queen = new Queens();
        queen.toSolve(5);
    }

}