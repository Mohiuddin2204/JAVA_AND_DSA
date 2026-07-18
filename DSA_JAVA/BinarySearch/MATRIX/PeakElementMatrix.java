package BinarySearch.MATRIX;
import java.util.*;

// two adjacent cells are not same
public class PeakElementMatrix {
    //return row and column of any peak element (greater than top,bottom,left,right)
    // finding max of column (mid)
    public static int maxOfColumn(int[][] a,int n,int m,int mid){
        int max=Integer.MIN_VALUE; int id=-1;
        for(int i=0;i<n;i++){
            if(a[i][mid]>max){
                max=a[i][mid]; id=i;
            }
        }
        return id;
    }
    // TC : O(NlogM)
    public static List<Integer> peakMatrix(int[][] a){
        int n=a.length; int m=a[0].length; //N*M
        List<Integer> al=new ArrayList<>();
        int l=0; int h=m-1;
        while(l<=h){
            int mid=(l+h)/2;
            int r=maxOfColumn(a,n,m,mid);
            int left= (mid-1)>=0 ? a[r][mid-1] : Integer.MIN_VALUE;
            int right= (mid+1)<m ? a[r][mid+1] : Integer.MIN_VALUE;
            if(a[r][mid]>left && a[r][mid]>right){
                al.add(r); al.add(mid); return al;
            }
            else if(a[r][mid]<left) {h=mid-1; }
            else{ l=mid-1;}
        }
        al.add(-1);al.add(-1);  return al;
    }
    public static void main(String[] args) {
        int[][] a={{4,2,5,1,4,5},
                {2,9,3,2,3,2},
                {1,7,6,0,1,3},
                {3,6,2,3,7,2}};
        List<Integer> al=peakMatrix(a);
        System.out.println("row : "+al.get(0)+" col: "+al.get(1));
        System.out.println(a[al.get(0)][al.get(1)]);
    }
}
