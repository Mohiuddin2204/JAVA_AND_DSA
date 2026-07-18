package BinarySearch.MATRIX;

public class SearchInSortedMatrix {
    //FLATTEN 2D INTO 1D
    public static int search(int[][] a,int t){
        int n=a.length; int m=a[0].length; //N*M
        int l=0; int h=(n*m)-1;
        while(l<=h){
            int mid=(l+h)/2;
            int r=mid/m; int c=mid%m;  // to get row and column
            if(a[r][c]==t){
                System.out.println("found at "+r+" "+c+ " =");
                return a[r][c];
            }
            else if(a[r][c]<t) {l=mid+1;}
            else {h=mid-1;}
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] a={{3,4,7,9},
                {12,13,16,18},
                {20,21,23,29}};
        int t=23;
        System.out.println(search(a,t));
    }
}
