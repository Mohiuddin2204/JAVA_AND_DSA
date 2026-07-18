package BinarySearch.MATRIX;

public class RowWithMaximumOnes {
    //Binary solution will be : each row wise => do lower bound of 1 for each row
    // TC : O(NlogM)
    //Most optimal solution is come from last column with loops : TC : O(M+N)
    public static int maxOnesRow(int[][] a){
        int n=a.length;int m=a[0].length;  //N*M
        int j=m-1;
        while(j>=0 && a[0][j]==1){
            j--; // for first row
        }
        int r=0;
        for(int i=1;i<n;i++){
            while(j>=0 && a[i][j]==1){
                j--; r=i;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int[][] a={{0,0,0,1,1,1}
                ,{0,1,1,1,1,1}
                ,{0,0,0,0,0,0}
                ,{0,0,1,1,1,1}
                ,{1,1,1,1,1,1}};
        System.out.println(maxOnesRow(a));
    }
}
