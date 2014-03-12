public class BinSearch{
    public static int rbsearch(int n, int[]L){
        //base case if length=1
        //base case if L[half]=n
        if (L.length==1){
            if (L[0]==n){
                return 1;
            }else{
                return -1;
            }
        }else if (L[L.length/2]==n){
            return L.length/2;
        }else{
            if (L[L.length/2]>n){
                int[]a=new int[L.length/2];
                for (int i = 0;i<a.length;i++){
                    a[i]=L[i];
                }
                int b = rbsearch(n,a);
                if (b==-1){
                    return -1;
                }
                return L.length/2 - b;
            }else{
                int []a=new int[L.length-L.length/2];
                for (int i = 0;i<a.length;i++){
                    a[i]=L[L.length/2 + i];
                }
                int b = rbsearch(n,a);
                if (b==-1){
                    return -1;
                }
                return L.length/2 + b;
            }
        }
    }

    public static int ibsearch(int n, int[]L){
        int a = L.length/2;
        int temp;
        int lastat = L.length;
        while(L[a]!=n){
            if (a==0||a>=L.length){
                return -1;
            }
            if (L[a]>n){
                lastat = a;
                a/=2;
            }else{
                a=(a+lastat)/2;
            }
        }
        return a;
    }

    public static void main(String[]args){
        int[] a = new int[1000];
        for (int i=0;i<a.length;i++){
            a[i]=i;
        }
        System.out.println(rbsearch(6,a));
        System.out.println(rbsearch(199,a));
        System.out.println(rbsearch(500,a));
        System.out.println(ibsearch(6,a));
        System.out.println(ibsearch(199,a));
        System.out.println(ibsearch(500,a));
    }
}
