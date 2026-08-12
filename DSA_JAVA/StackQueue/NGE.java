package StackQueue;

import java.util.Stack;

public class NGE {
    //NEXT GREATER ELEMENT
    //USING MONOTONIC STACK : DECREASING ORDER
    // TRAVERSING FROM LAST OF ARRAY
    public static void main(String[] args) {
        int[] a={4,12,5,3,1,2,5,3,1,2,4,6};
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && a[i]>=st.peek()){st.pop();}
            if(st.isEmpty()){nge[i]=-1;}
            else{nge[i]=st.peek();}
            st.push(a[i]);
        }
        for(int i:nge){
            System.out.print(i+" ");
        }
    }
}
