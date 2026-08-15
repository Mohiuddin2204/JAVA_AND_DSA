package StackQueue;
import java.util.Stack;

public class RemoveKDigits {
    public static String removeKd(String s,int k){
        char[] a=s.toCharArray(); int n=a.length;
        StringBuilder sb=new StringBuilder(); // instead of stack , directly entering into string builder
        // approach : GREEDY => keeping small at start , removing k largest
        for(char d:a){
            while (!sb.isEmpty() && k>0 && sb.charAt(sb.length()-1)>d){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(d);
        }
        while (k>0){
            sb.deleteCharAt(sb.length()-1); k--;
        }
        String res=sb.toString().replaceAll("^0+",""); // removing if any starting zeroes
        return res.isEmpty()?"0":res;
    }
    public static void main(String[] args) {
        System.out.println(removeKd("1432219",3));
        System.out.println(removeKd("1432219",7));
        System.out.println(removeKd("670100",2));
    }
}
