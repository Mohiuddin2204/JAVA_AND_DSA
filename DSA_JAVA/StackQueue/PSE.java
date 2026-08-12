package StackQueue;

import java.util.Stack;

public class PSE {
    public static void main(String[] args) {
        // PREVIOUS SMALLER ELEMENT
        // MONOTONIC STACK APPROACH : increasing STACK
        int[] a={4,5,2,10,8};
        Stack<Integer> st=new Stack<>();
        int[] pse =new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[i]<=st.peek()){st.pop();}
            if(st.isEmpty()){
                pse[i]=-1;}
            else{
                pse[i]=st.peek();}
            st.push(a[i]);
        }
        for(int i: pse){
            System.out.print(i+" ");
        }
    }
}
