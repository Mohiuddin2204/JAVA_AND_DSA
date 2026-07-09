package Recursion;

public class GenerateParentheses {
    public static void genP(String c, int open, int closed, int n){
        if(c.length()==(2*n)){
            System.out.print(c+" ");
            return;
        }
        if(open<n){
            genP(c+"(",open+1,closed,n);
        }
        if(closed<open){
            genP(c+")",open,closed+1,n);
        }
    }
    public static void main(String[] args) {
        int n=3;
        genP("",0,0,n);
    }
}
