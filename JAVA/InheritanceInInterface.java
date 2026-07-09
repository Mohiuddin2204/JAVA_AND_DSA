interface X{
    void m1();
    void m2();
}
interface Y extends X{
    void m3();
    void m4();
}
class XY implements Y{
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }
    public void m3(){
        System.out.println("m3");
    }
    public void m4(){
        System.out.println("m4");
    }
}
public class InheritanceInInterface {
    public static void main(String[] args) {
    XY xy= new XY();
    xy.m3();
    xy.m1();
        xy.m4();
        xy.m2();
    }
}
