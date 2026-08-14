package StackQueue;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int[] nse(int[] a){
        int[] nse=new int[a.length];
        Stack<Integer> st=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && a[i]<=a[st.peek()]){st.pop();}
            if(st.isEmpty()){nse[i]=a.length;}
            else{nse[i]=st.peek();}
            st.push(i);
        }
        return nse;
    }
    public static int[] pse(int[] a){
        Stack<Integer> st=new Stack<>();
        int[] pse =new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[i]<a[st.peek()]){st.pop();}
            if(st.isEmpty()){
                pse[i]=-1;}
            else{
                pse[i]=st.peek();}
            st.push(i);
        }
        return pse;
    }
    // TC: O(5N)
    public static int brute(int[] a){
        int A=0;
        int[] nse=nse(a);
        int[] pse=pse(a);
        for(int i=0;i<a.length;i++){
            A=Math.max(A,a[i]*(nse[i]-pse[i]-1));
        }
        return A;
    }
    public static void main(String[] args) {
        int[] a={3,2,10,11,5,10,6,3}; int n=a.length;
        System.out.println(brute(a));
        // approach :  a[i]*(nse-pse-1)
        // but to reduce complexity => will try to calculate nse , pse in one loop itself
        // stack take cares of it
        Stack<Integer> st=new Stack<>();
        int A=0;
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[st.peek()]>a[i]){
                int el=st.pop();
                int nse=i;int pse=st.isEmpty()?-1:st.peek();
                A=Math.max(A,a[el]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int nse=a.length;int el=st.pop();int pse=st.isEmpty()?-1:st.peek();
            A=Math.max(A,a[el]*(nse-pse-1));
        }
        System.out.println(A);
    }
}
