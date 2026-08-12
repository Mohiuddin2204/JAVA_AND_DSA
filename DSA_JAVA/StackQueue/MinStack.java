package StackQueue;

import java.util.Stack;

public class MinStack {
    public static Stack<Integer> s=new Stack<>();
    public static int mini=Integer.MAX_VALUE;
    public static void push(int x){
        if(s.isEmpty()){
            mini=x;
            s.push(x);
        }
        else{
            if(x<mini){
                s.push(2*x-mini);
                mini=x;
            }
            else{
                s.push(x);
            }
        }
    }
    public static void pop(){
        if(s.isEmpty()){return ;}
        int val=s.pop();
        if(val<mini){mini=2*mini-val;}
    }
    public static int top(){
        int val=s.peek();
        if(val<mini){return mini;}
        return val;
    }
    public static int getmin(){
        return mini;
    }
    public static void main(String[] args) {
        push(12);push(15);push(10);
        System.out.println(getmin());pop();
        System.out.println(getmin());
        System.out.println(top());
        push(10);
        System.out.println(top());
    }
}
