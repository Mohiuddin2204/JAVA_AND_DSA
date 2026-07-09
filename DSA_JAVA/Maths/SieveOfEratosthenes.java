package Maths;
//PRINT ALL PRIME NUMBERS TILL N
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=30;
        int[] p=new int[n+1];
        for(int i=2;i<=n;i++){
            p[i]=1;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(p[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    p[j]=0;
                }
            }
        }
        //MARKED AS 1= prime , AS 0=not prime
        for(int i=2;i<=n;i++){
            if(p[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}
