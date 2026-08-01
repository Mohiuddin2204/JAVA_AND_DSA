package Maths;

public class HCF {
    static int gcd(int a,int b){
        //EUCLIDEAN ALGORITHM : ITERATIVE CODE
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
    static int gcdrec(int a,int b){
        //EUCLIDEAN ALGORITHM : RECURSIVE CODE
        if(b==0){return a;}
        return gcdrec(b,a%b);
    }
    public static void main(String[] args) {
        int x=gcd(40,45);
        System.out.println(x);
        System.out.println(gcdrec(32,112));
    }
}
