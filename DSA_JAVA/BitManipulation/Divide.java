package BitManipulation;
// DOING DIVISION USING BITWISE OPERATORS
public class Divide {
    public static int divide(int dividend,int divisor){
        int ans=0;
        if(dividend==divisor){
            return 1;
        }
        boolean sign=true;
        if(dividend>=0 && divisor<0){
            sign=false;
        }
        if(dividend<0 && divisor>0){
            sign=false;
        }
        int n=Math.abs(dividend); int d=Math.abs(divisor); int div=Math.abs(divisor);
        while(n>=d){
            int c=0;
            while(n >= (d*(1<<(c+1)))){
                c++;
            }
            ans=ans+(1<<c);
            n=n-(d*(1<<c));
        }
        return sign?ans:(-1*ans);
    }
    public static void main(String[] args) {
        int a=22; int b=3;
        //22/3 = 7 => 7 = 2^2 + 2^1 + 2^0
        // 22 ~  3* (2^2 + 2^1 + 2^0)
        // 22 - 12 =>  3* 2^2 max which we can subtract
        // 10 - 6 => 3* 2^1
        // 4 - 3 => 3* 2^0
        // 1 less than 3 = stop
        System.out.println(divide(a,b));
    }
}
