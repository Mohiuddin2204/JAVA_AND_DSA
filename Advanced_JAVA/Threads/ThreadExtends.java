package Threads;
import java.lang.Thread;
class MyT1 extends Thread {
    @Override
    public void run(){
        int i=0;
        while(i<400) {
            System.out.println("running");
            System.out.println("happy");
            i++;
        }
    }
}
class MyT2 extends Thread{
    @Override
    public void run(){
        int j=0;
        while(j<400) {
            System.out.println("running2");
            System.out.println("sad");
            j++;
        }
    }
}

public class ThreadExtends {
    public static void main(String[] args) {
MyT1 t1=new MyT1();
MyT2 t2=new MyT2();
t1.start();
t2.start();
    }
}
