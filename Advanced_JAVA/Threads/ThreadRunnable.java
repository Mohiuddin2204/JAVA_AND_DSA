package Threads;

class MyTr1 implements Runnable{
    public void run(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
}
class MyTr2 implements Runnable{
    public void run(){
        System.out.println("11");
        System.out.println("22");
        System.out.println("33");
        System.out.println("44");
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {
        MyTr1 b1=new MyTr1();
        Thread t1=new Thread(b1);
        MyTr2 b2=new MyTr2();
        Thread t2=new Thread(b2);
        t1.start();
        t2.start();
    }
}
