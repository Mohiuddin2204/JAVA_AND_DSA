package Recursion;

public class ReverseArray {
    //ARRAYS GET MODIFIED (ACTS AS CALL BY REFERENCE)
    public static void fn(int l,int r,int[] a){
        if(l>=r) return;
        int t=a[l];
        a[l]=a[r];
        a[r]=t;
        fn(l+1,r-1,a);
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        fn(0,a.length-1,a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
