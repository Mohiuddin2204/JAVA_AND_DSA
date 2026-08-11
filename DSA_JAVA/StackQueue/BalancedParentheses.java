package StackQueue;
import java.util.Stack;

public class BalancedParentheses {
    public static boolean func(String s){
        char[] c=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(char ch:c){
            if(ch=='(' || ch=='{' || ch=='['){st.push(ch);}
            else{
                if(st.isEmpty()){return false;}
                char x=st.pop();
                if((ch==')' && x=='(') || (ch=='}' && x=='{') || (ch==']' && x=='[')){continue;}
                else{return false;}
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="(){[]}"; String s1="(){{}]";
        System.out.println(func(s));
        System.out.println(func(s1));
    }
}
