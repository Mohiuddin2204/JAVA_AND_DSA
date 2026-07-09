package Recursion;
import java.util.*;
//PRINT THE SUBSEQUENCES
public class Subsequences {
    public static void subseqString(String s,int i,String ns){
        if(i==s.length()){
            System.out.print(ns+" ");
            return;
        }
        char c=s.charAt(i);
        subseqString(s,i+1,ns);
        subseqString(s,i+1,ns+c);
    }
    public static void subseqArray(int[] a, int i, List<Integer> l){
        if(i==a.length){
            System.out.print(l+" ");
            return;
        }
        subseqArray(a,i+1,l);

        l.add(a[i]);
        subseqArray(a,i+1,l);
        l.removeLast();  // remove it in backtracking as list is mutable
    }
    public static void main(String[] args) {
        String str="ABC";
        subseqString(str,0,"");
        int[] a={1,2,3};
        System.out.println();
        subseqArray(a,0,new ArrayList<>());
    }
}
