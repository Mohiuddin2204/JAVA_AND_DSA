import AccModifiers.C;

class ChildC extends C {
    public void printing(){
        System.out.println(x);
        System.out.println(y);
       // System.out.println(z);// cannot access default as it is not in same direct package AccModifiers...
        //   System.out.println(a);  No access in subclass for private
    }
}


public class DefaultAccessInSubClass {
    public static void main(String[] args) {
ChildC cc=new ChildC();
cc.printing();
 C c1 =new C();
     //   System.out.println(c1.y); cant access protected also , as c1 is not extended from C
    }
}
