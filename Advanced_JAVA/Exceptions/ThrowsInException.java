package Exceptions;
//throws is a caution that a function may throw exception

public class ThrowsInException {
    public static int d(int a,int b) throws ArithmeticException{
        int r=a/b;
        return r;
    }
    public static void main(String[] args) {
    try{
        int c=d(6,0);
        System.out.println(c);
    }
    catch (Exception e){
        System.out.println(e);
    }
    }
}
