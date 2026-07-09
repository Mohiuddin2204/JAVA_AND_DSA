class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void print(){
        System.out.println("father");
    }

    public Base(int x) {
        this.x = x;
        System.out.println("baap if called then come");
    }
    public Base(){
        x=55;
        System.out.println("hellooo i will definitely come");
    }

}
class Derived extends Base{
    int y; int z;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Derived(){
        y=11;
        System.out.println("sonn");
    }
    public Derived(int y){
        super.x=323;
        this.y=y;
    }
    public void printAll(){
        System.out.println(super.x+ " "+ y);
    }
    public Derived(int y,int z){
        super(100);    // called arg constructor
        this.y=y;this.z=z;
        System.out.println("bachaa");
    }


}
public class Inheritance {
    public static void main(String[] args) {
//        Derived d=new Derived();
//        d.setX(5);
//        System.out.println(d.getX()); // can access Base
//        d.print();
        Derived d2 = new Derived();    // base runs then derived runs
        Derived d3=new Derived(543);   // definitely runs no arg constructor of base...
        d3.printAll();
        //if we want any other overloaded constructor of Base => use super(x) like this in constructor of Derived...
    Derived d4=new Derived(11,22); // overloaded one is called now...
    }
}
