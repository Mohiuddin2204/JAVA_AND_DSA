import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        while(true){
//            System.out.println("infinite loop");
//        }
        //while(1)            => not allowed like in C
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //Multiplication Table
        for(int i=1;i<=n;i++){
            System.out.println(n + " * " + i +" = " + (n*i) );
        }

        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
