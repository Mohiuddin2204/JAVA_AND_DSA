package StackQueue;

public class MinAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String s=")()(())((("; char[] a=s.toCharArray();
        int open=0;int close=0;
        for(int i:a){
            if(i=='('){open++;}  // PUSH '('
            else{
                if(open<=0){close++;} // just push ')' is stack is empty
                else {open--;} //POP '(' if it is ')'
            }
        }
        System.out.println(open+close);
        // STACK APPROACH
        // PUSH '(' , POP '(' if it is ')'
        // just push ')' is stack is empty
        // at last return stack size
    }
}
