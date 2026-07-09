package Exceptions;
//Finally always executed whether exception is handled/not
//used to execute code containing instructions to release system resources, close a connection...
public class FinallyInException {
    public static void main(String[] args) {
    int b=9;
    while (true){
        try{
            System.out.println(8/b);
        }
        catch (Exception e){
            System.out.println(e);
            break;
        }
        finally {
            System.out.println("finally"); //even after break=> it executes
        }
        b--;
    }
    }
}
