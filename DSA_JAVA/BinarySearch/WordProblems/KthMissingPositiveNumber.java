package BinarySearch.WordProblems;

public class KthMissingPositiveNumber {
    // increasing array :[ 2 3 4 7 11 ]
    // missing numbers : 1, 5 , 6 , 8,9, 10
    // if k=5 , return 5th missing number => 9.
    // figure out ranges in which number lies
    // a = 2 3 4 7 11
    //     1 2 3 4 5   => as at 7 , should have been 4 => 7-4 = 3 numbers already missing
    public static int kthmissing(int[] a,int k){
        int l=0; int h=a.length-1;
        while(l<=h){
            int m=(l+h)/2;
            int miss=a[m]-m-1;
            if(miss<k){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return h+1+k;  // h will be pointed at index 3 at last, 3+1+k = answer
    }
    public static void main(String[] args) {
        int[] a={2,3,4,7,11}; int k=5;
        System.out.println(kthmissing(a,k));
    }
}
