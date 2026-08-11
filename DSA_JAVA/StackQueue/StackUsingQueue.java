package StackQueue;
import java.util.*;

public class StackUsingQueue {
    public static Queue<Integer> q=new LinkedList<>();
    public static void push(int x){
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
    }
    public static int pop(){
       if(!empty()){  return q.remove();}
       return -1;
    }
    public static int top(){
       if(!empty()) {return q.peek();}
       return -1;
    }
    public static boolean empty(){
        return q.isEmpty();
    }
    public static void main(String[] args) {
        push(4); push(1); push(5); push(6);
        System.out.println(q);
        pop(); pop();
        System.out.println(top());
        pop();
        System.out.println(q);
    }
}
