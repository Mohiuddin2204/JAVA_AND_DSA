abstract class Parent{
    public Parent(){
        System.out.println("parent constructor");
    }
    public void sayH(){                 //non-abstract method
        System.out.println("hello");
    }
    abstract public void greet();          //abstract method
}
class Son extends Parent{
    @Override
    public void greet(){
        System.out.println("morning");
    }
    public void child(){                    //other methods
        System.out.println("bachaa");
    }
}

public class Abstract {
    public static void main(String[] args) {
//Parent p=new Parent();   Not allowed
        Son s=new Son();
        s.greet();
        s.sayH();
        s.child();
    }
}
