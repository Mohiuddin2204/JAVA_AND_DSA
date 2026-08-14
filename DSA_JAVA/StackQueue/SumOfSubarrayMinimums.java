package StackQueue;
import java.util.Stack;

public class SumOfSubarrayMinimums {
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
    //nse=next smaller element , psee=prev smaller or equal element
    // so that few sub-arrays do not get count twice
    public static int[] psee(int[] a){
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
    // stack stores indices (not elements) => for our approach :
    //  for each index is : left*right*a[i] , left=i-psee , right=nse-i
    // left*right gives all sub-arrays with in a[i] is smaller
    public static void main(String[] args) {
        int[] a={3,1,2,4};int n=a.length;
        int t=0;
        int[] psee=psee(a);
        int[] nse=nse(a);
        for(int i=0;i<n;i++){
            int l=i-psee[i];
            int r=nse[i]-i;
            t+=(l*r*a[i]);
        }
        System.out.println(t);
    }
}
