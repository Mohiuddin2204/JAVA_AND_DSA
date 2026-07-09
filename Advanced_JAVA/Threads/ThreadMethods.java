package Threads;
class MyTrm1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<11){
            System.out.println("hiii1");    i++;
        }
    }
}
class MyTrm2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<11){
            System.out.println("hiii2");  i++;
        }
    }
}
class MyTrm3 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("hiii3");
            try{
                Thread.sleep(455); //455ms sleeps t3 then t3,t4 runs as usual
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class MyTrm4 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("hiii4");
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
//    MyTrm1 t1=new MyTrm1();
//    MyTrm2 t2=new MyTrm2();
//    t1.start();
//    try{
//        t1.join();           //t1 execute completely then only t2 runs
//    }
//    catch(Exception e){
//        System.out.println(e);
//    }
//    t2.start();
    MyTrm3 t3=new MyTrm3();
    MyTrm4 t4=new MyTrm4();
    t3.start();t4.start();
    }
}
