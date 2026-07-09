package Recursion;
//x power n in T.C = O(log n)
public class PowerFunction {
    public static double pow(double x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n<0){
            x= 1/x;
            n= -n;
            return pow(x,n);
        }
        double halfPower = pow(x, n / 2);
        if(n%2==0){
            return halfPower*halfPower;
        }
            return halfPower*halfPower* x;
    }
    public static void main(String[] args) {
        System.out.println(pow(9,3));
        System.out.println(pow(4,-2));
    }
}
