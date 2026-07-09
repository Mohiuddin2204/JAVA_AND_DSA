class A{
    public void p(){
        System.out.println("hi");
    }
    public void a(){
        System.out.println("father");
    }
}
class B extends A{
    @Override
    public void p(){
        System.out.println("hi2");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        A a=new A();
        a.p();  // base
        B b=new B();
        b.p();   // override
        b.a();  // derived calling in base
    }
}
