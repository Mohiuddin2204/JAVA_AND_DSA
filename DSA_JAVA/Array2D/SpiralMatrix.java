package Array2D;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}};
        //traversal like spiral (snake)
        int m=a.length; int n=a[0].length;  //M*N
        int t=0;int l=0;int b=m-1; int r=n-1; //top , left , bottom , right
        // R->B->L->T
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                System.out.print(a[t][i]+" "); // first row
            }
            t++; //first row done
            for(int i=t;i<=b;i++){
                System.out.print(a[i][r]+" "); // last column
            }
            r--; //last column done
            if(t<=b){  // condition for only 1 row matrix
                for(int i=r;i>=l;i--){
                    System.out.print(a[b][i]+" "); // last row
                }
                b--;
            }
            if(l<=r){   // condition for only 1 column matrix
                for(int i=b;i>=t;i--){
                    System.out.print(a[i][l]+" "); // first column
                }
                l++;
            }
        }
    }
}
