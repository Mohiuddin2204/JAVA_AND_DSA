package Exceptions;

public class TryCatch {
    public static void main(String[] args) {
int a=5;
int b=0;
try{               //exception rising code
    int c=a/b; System.out.println(c);
}
catch (Exception e){          //exception handling
    System.out.println("exception it is");
    System.out.println(e);
}
    }
}
