package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int sp=(n-i);sp>=0;sp--){
                System.out.print(" ");
            }
            for(int st=1;st<=i;st++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
