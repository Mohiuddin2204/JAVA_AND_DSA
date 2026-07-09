package Exceptions;

import java.util.Scanner;
/* program that allows to keep accessing an array until a valid index is given ,
 if max tries exceeds 5, print error */
public class ExceptionProgram {
    public static void main(String[] args) {
        int[] m=new int[3];
        m[0]=7;m[1]=56;m[2]=6;
        Scanner sc=new Scanner(System.in);
        int id;int i=0;
        while(i<5){
            try{
                id=sc.nextInt();
                System.out.println(m[id]);  //exception code line
                break;
            }
            catch (Exception e){
                System.out.println(e);
                i++;
            }
        }
        if(i>=5){
            System.out.println("exceeded 5 , error");
        }
    }
}
