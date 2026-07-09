class One{
    public void g(){
        System.out.println("g");
    }
    public void n(){
        System.out.println("n");
    }
}

class Two extends One{
    public void g2(){
        System.out.println("g2");
    }
    public void n() {
        System.out.println("nn");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        One o=new Two();       //Two is One, reference is One , Object is Two
        o.g();                  //Object created at run time
        o.n();
        // o.g2(); Not allowed
        // Two t=new One();  Not allowed
    }
}
