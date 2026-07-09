import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if(y%4 ==0){
            if((y%100)==0 && (y%400)!=0){
                System.out.println("Not leap");
            }
            else{
                System.out.println("Leap");
            }
        }
        else{
            System.out.println("not leap");
        }
    }
}
