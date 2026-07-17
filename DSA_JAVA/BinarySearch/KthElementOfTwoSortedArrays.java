package BinarySearch;

public class KthElementOfTwoSortedArrays {
    //APPROACH SAME AS MEDIAN SYMMETRY APPROACH
    //left side k elements => return max(l1,l2)
    public static int kthElement(int[] a,int[] b,int n1,int n2,int k){
        if(n1>n2){return kthElement(b,a,n2,n1,k);}
        int l=Math.max(0,k-n2); int h=Math.min(k,n1); int left=k; int n=n1+n2;
        while(l<=h){
            int m1=(l+h)/2;  // points at r1
            int m2= left-m1; // points at r2
            int l1=Integer.MIN_VALUE; int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE; int r2=Integer.MAX_VALUE;
            if(m1<n1){r1=a[m1];}
            if(m2<n2){r2=b[m2];}
            if(m1-1>=0){l1=a[m1-1];}
            if(m2-1>=0){l2=b[m2-1];}
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){h=m1-1;}
            else{l=m1+1;}
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a={2,3,6,7}; int[] b={1,4,8,9,10}; int n1=a.length; int n2=b.length; int k=4;
        System.out.println(kthElement(a,b,n1,n2,k));
    }
}
