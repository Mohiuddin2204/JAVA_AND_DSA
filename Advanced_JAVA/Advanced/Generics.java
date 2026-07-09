package Advanced;

class MyG<T1>{
    int v;private T1 t1;
    public MyG(int v,T1 t1){
        this.v=v;this.t1=t1;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
public class Generics {
    public static void main(String[] args) {
        MyG<String> g1=new MyG<>(23,"str");
        String s=g1.getT1();
        System.out.println(s);
    }
}