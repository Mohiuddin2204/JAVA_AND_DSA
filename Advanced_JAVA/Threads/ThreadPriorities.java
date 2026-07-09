package Threads;

class MyTrp extends Thread{
    public MyTrp(String name){
        super(name);
    }
    @Override
    public void run(){
        while(true){
            System.out.println("hiii"+ this.getName());
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        MyTrp t1=new MyTrp("first(last)");
        MyTrp t2=new MyTrp("second");
        MyTrp t3=new MyTrp("third");
        MyTrp t4=new MyTrp("fourth(imp)");
        t4.setPriority(Thread.MAX_PRIORITY); //20
        t1.setPriority(Thread.MIN_PRIORITY); //1
        t2.setPriority(9); //higher
        t3.setPriority(6); //lower
        t1.start();
        t2.start();
        t4.start();
        t3.start();
    }
}