import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random r=new Random();
        int n=r.nextInt(3);               // chooses from 0,1,2   :  [0,3) integers
        Scanner sc=new Scanner(System.in);
        // 0=rock , 1=paper , 2=scissor
        int my=sc.nextInt();
        String[] arr={"Rock","Paper","Scissor"};
        System.out.println("ours: "+arr[my]);
        System.out.println("computers: "+arr[n]);
        if(n==my){
            System.out.println("Tie");
        }
        else if(n==0 && my==2){
            System.out.println("lose");
        }
        else if(n==2 && my==1){
            System.out.println("lose");
        }
        else if(n==1 && my==0){
            System.out.println("lose");
        }
        else{
            System.out.println("winner");
        }
    }
}
