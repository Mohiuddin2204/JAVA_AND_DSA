package Maths;

public class HCF {
    static int gcd(int a,int b){
        //EUCLIDEAN ALGORITHM
        while(a>0 && b>0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public static void main(String[] args) {
        int x=gcd(40,45);
        System.out.println(x);
    }
}
