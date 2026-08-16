package StackQueue;
import java.util.Stack;

public class StockSpan {
    public static Stack<int[]> st=new Stack<>();
    /* as the func requires price(array element) and we need to return max consecutive days
     for which stock price was less than or equal to current day (from previous to current)
     we store array : {price,s} => s=consecutive days (if stack peek <=current) add it up and pop  */
    public static int next(int price){
        int s=1;
        while (!st.isEmpty() && st.peek()[0]<=price){
            s+=st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price,s});
        return s;
    }
    public static void main(String[] args) {
        int[] a={7,2,1,3,3,1,8};
        for(int i:a){
            System.out.print(next(i)+" ");
        }
    }
}
