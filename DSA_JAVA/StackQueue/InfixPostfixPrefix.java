package StackQueue;
import java.util.*;

public class InfixPostfixPrefix {
    public static HashMap<Character,Integer> hm=new HashMap<>();
    public static String infixToPostfix(String s){
        Stack<Character> st=new Stack<>();
        char[] c=s.toCharArray(); String ans="";
        for(char ch:c){
            if(Character.isLetterOrDigit(ch)){ans+=ch;}
            else if(ch=='('){st.push(ch);}
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans+=st.pop();
                }
                st.pop();
            }
            else{  //operator
                while (!st.isEmpty() && (hm.get(ch)<=hm.get(st.peek()))){
                    ans+=st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()){
            if(st.peek()=='('){
                return "";
            }
            ans+=st.pop();
        }
        return ans;
    }
    public static String infixToPrefix(String s){
        StringBuilder ans=new StringBuilder(); char[] c=s.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            if(c[i]=='('){ans.append(')');}
            else if(c[i]==')'){ans.append('(');}
            else{ans.append(c[i]);}
        }
        String answer=infixToPostfix(ans.toString());
        StringBuilder a=new StringBuilder(answer);
        return a.reverse().toString();
    }
    public static String postfixToInfix(String s){
        char[] c=s.toCharArray(); Stack<String> st=new Stack<>();
        for(int i=0;i<c.length;i++){
            char ch=c[i];
            if(Character.isLetterOrDigit(ch)){st.push(String.valueOf(ch));}
            else{
                String ans="";
                String t1=st.pop(); String t2=st.pop();
                ans+="("+t2+ch+t1+")";
                st.push(ans);
            }
        }
        return st.peek();
    }
    public static String prefixToInfix(String s){
        char[] c=s.toCharArray(); Stack<String> st=new Stack<>();
        for(int i=c.length-1;i>=0;i--){
            char ch=c[i];
            if(Character.isLetterOrDigit(ch)){st.push(String.valueOf(ch));}
            else{
                String ans="";
                String t1=st.pop(); String t2=st.pop();
                ans+="("+t1+ch+t2+")";
                st.push(ans);
            }
        }
        return st.peek();
    }
    public static String postfixToPrefix(String s) {
        char[] c = s.toCharArray();
        Stack<String> st = new Stack<>();
        for(int i=0;i<c.length;i++){
            char ch=c[i];
            if(Character.isLetterOrDigit(ch)){st.push(String.valueOf(ch));}
            else{
                String ans="";
                String t1=st.pop(); String t2=st.pop();
                ans+=ch+t2+t1;
                st.push(ans);
            }
    }
        return st.peek();
    }
    public static String prefixToPostfix(String s){
        char[] c = s.toCharArray();
        Stack<String> st = new Stack<>();
        for(int i=c.length-1;i>=0;i--){
            char ch=c[i];
            if(Character.isLetterOrDigit(ch)){st.push(String.valueOf(ch));}
            else{
                String ans="";
                String t1=st.pop(); String t2=st.pop();
                ans+=t1+t2+ch;
                st.push(ans);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        hm.put('^',3);hm.put('*',2); hm.put('/',2); hm.put('+',1); hm.put('-',1); hm.put('(',0);
        System.out.println(infixToPostfix("a+b*(x^d-e)"));
        System.out.println(infixToPrefix("(A+B)*C-D+F"));
        System.out.println(postfixToInfix("AB-DE+F*/"));
        System.out.println(prefixToInfix("*+PQ-MN"));
        System.out.println(postfixToPrefix("AB-DE+F*/"));
        System.out.println(prefixToPostfix("/-AB*+DEF"));
    }
}
