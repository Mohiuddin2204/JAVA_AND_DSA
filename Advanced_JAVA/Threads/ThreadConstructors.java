package Threads;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while(i<11){
            System.out.println("hiii");
            i++;
        }
    }
}

public class ThreadConstructors {
    public static void main(String[] args) {
    MyThr t1=new MyThr("Mai thr hoon");
    t1.start();
        System.out.println(t1.getName()+" "+t1.getId());    //some number:ID
    }
}