package StackQueue;

import java.util.Stack;

public class NGE2 {
    public static void main(String[] args) {
        // CIRCULAR DIRECTION AS WELL
        int[] a={2,10,12,1,11}; int n=a.length;
        Stack<Integer> s=new Stack<>();
        int[] nge=new int[a.length];
        // MAKING ARRAY SIDE BY SIDE (MAINTAINING CIRCULAR PART)
        //2 10 12 1 11   2 10 12 1 11 -> AS NOW BESIDE 11 THERE ARE ELEMENTS(CIRCULAR...)
        for(int i=(2*n)-1;i>=0;i--){
            while (!s.isEmpty() && s.peek()<=a[i%n]){s.pop();}
            //FOR THE ARRAY ELEMENTS => STORING NGE
            if(i<n){
                nge[i]=s.isEmpty()?-1:s.peek();
            }
            s.push(a[i%n]);
        }
        for(int i:nge){
            System.out.print(i+" ");
        }
    }
}
