package StackQueue;
import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] a={4,7,1,1,2,-3,-7,17,15,-16};
        // every element denotes : size of asteroid
        // positive sign -> moving right , negative sign => moving left
        // suppose :  12 ->  <-  -17 , here 12 gets destroyed
        //  17 -> <- -12 , here -12 gets destroyed ,  12 -> <- -12 here both gets destroyed
        // approach will be to store positive elements in stack
        // as we need LIFO => for collision check
        Stack<Integer> st=new Stack<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>0){st.push(a[i]);} // Positive elements push
            else{
                while (!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(a[i])){
                    st.pop();
                } // POP ELEMENTS IF NEGATIVE ELEMENTS ARE HIGHER
                if(!st.isEmpty() && st.peek()==Math.abs(a[i])){
                    st.pop();
                } // POP IF BOTH ARE EQUAL
                else if(st.isEmpty() || st.peek()<0){
                    st.push(a[i]);
                } // IF STACK GOT Empty => AND NEGATIVE ONES LEFT -> PUSH THEM
            }
        }
        while (!st.isEmpty()){
            l.add(st.pop());
        }
        Collections.reverse(l);
        System.out.println(l);
    }
}
