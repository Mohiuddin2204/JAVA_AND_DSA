package Patterns;
/*
        A
       ABA
      ABCBA
 */
public class AlphaPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int sp=(n-i-1);sp>=0;sp--){
                System.out.print(" ");
            }
            int k=(2*i)+1;
            int brk=(k/2); char ch='A';
            for(int j=1;j<=k;j++){
                System.out.print(ch);
                if(j<=brk){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
