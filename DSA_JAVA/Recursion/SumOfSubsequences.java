package Recursion;
import java.util.*;
//PRINT ALL THE SUBSEQUENCES WITH THE GIVEN SUM
public class SumOfSubsequences {
    public static void subseqArray(int[] a, int i, List<Integer> l,int sum,int s){
        if(i==a.length){
            if(s>sum){
                return;
            }
            if(s==sum) {
                System.out.print(l + " ");
            }
            return;
        }
        int n=a[i];
        subseqArray(a,i+1,l,sum,s);

        l.add(n);
        s+=n;
        subseqArray(a,i+1,l,sum,s);
        s-=n;
        l.removeLast();  // remove it in backtracking as list is mutable
    }
    public static void main(String[] args) {
        int[] a={1,2,1};int sum=2;
        subseqArray(a,0,new ArrayList<>(),sum,0);
    }
}
