package Exceptions;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return  "mera tostring";
    }

    @Override
    public String getMessage() {
        return "mera getmessage";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try{
                throw new MyException(); //can throw exception explicitly
              //  throw new ArithmeticException();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e); //toString() gets called
                e.printStackTrace(); // error,line,func information is printed
            }
        }

    }
}
