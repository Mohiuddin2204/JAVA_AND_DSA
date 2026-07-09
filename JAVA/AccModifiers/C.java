package AccModifiers;

public class C{
    public int x=5;
    protected int y=45;
    int z=6;   //default
    private int a=67;
    public void m(){
        //same class=all can access
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class C1 extends C{
    public void childprint(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
     //   System.out.println(a);  No access in subclass for private
    }
// if this subclass is in other package or not direct under same package then cant access default
}

class AccessModifiers {
    public static void main(String[] args) {
    C c=new C();
    c.m();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
     //   System.out.println(c.a);  cannot access private in same package

        C1 ch=new C1();
        ch.childprint();
    }
}
