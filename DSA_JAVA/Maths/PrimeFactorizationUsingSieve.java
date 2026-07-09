package Maths;

public class PrimeFactorizationUsingSieve {
    public static void main(String[] args) {
        int n=780;
        int[] p=new int[n+1];
        for(int i=2;i<=n;i++){
            p[i]=i;
        }
        //SMALLEST PRIME FACTOR APPROACH
        for(int i=2;i<=Math.sqrt(n);i++){
            if(p[i]==i){
                for(int j=i*i;j<=n;j+=i){
                    if(p[j]==j){     //DON'T HAVE ALREADY SMALLER PRIME FACTOR, UPDATE
                        p[j]=i;
                    }
                }
            }
        }
        while(n!=1){
            System.out.print(p[n]+" ");
            n=n/p[n];
        }
    }
}
