package Patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        int total=(2*n)-1;
        int stars=1;int spaces=(2*n)-2;int lstars=1;
        for(int i=1;i<=total;i++){
            //stars
            for(int st=1;st<=stars;st++){
                System.out.print("*");
            }
            if(i>=n){
                stars--;
            }
            else {
                stars++;
            }
            //spaces
            for(int sp=1;sp<=spaces;sp++){
                System.out.print(" ");
            }
            if(i>=n){
                spaces+=2;
            }
            else {
                spaces-=2;
            }
            //last stars
            for(int st=1;st<=lstars;st++){
                System.out.print("*");
            }
            if(i>=n){
                lstars--;
            }
            else {
                lstars++;
            }
            System.out.println();
        }
    }
}
