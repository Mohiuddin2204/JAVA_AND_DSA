package BinarySearch.MATRIX;
// row and column wise sorted matrix
// better solution is row wise binary search : TC : O(NlogM)
// optimal solution is coming from top row and last column element : TC : O(N+M)
public class SearchInSortedMatrixRC {
    public static int searchRC(int[][] a,int t){
        int n=a.length; int m=a[0].length;  //N*M
        int r=0; int c=m-1;
        while(r<n && c>=0){
            if(a[r][c]==t){
                System.out.println("found at "+r+" "+c+ " =");
                return a[r][c];
            }
            else if(a[r][c]<t){r++;}
            else{c--;}
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] a={{1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};
        int t=14;
        System.out.println(searchRC(a,t));
    }
}
