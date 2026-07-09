package Exceptions;

import java.util.Scanner;

public class SpecificException {
    public static void main(String[] args) {
        int[] m=new int[3];
        m[0]=1;m[1]=2;m[2]=8;
        Scanner sc=new Scanner(System.in);
        System.out.println("index");
        int id=sc.nextInt();
        System.out.println("div by:");
        int no=sc.nextInt();
        try{
            System.out.println(m[id]);
            System.out.println(m[id]/no);
        }
        catch (ArithmeticException e){
            System.out.println("/0");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array se bahar");
            System.out.println(e);
        }
        catch(Exception e){               //any other
            System.out.println(e);
        }
        //prints the first exception which occurs...
    }
}
