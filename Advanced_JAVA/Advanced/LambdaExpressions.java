package Advanced;
@FunctionalInterface                  //only one empty method
interface Demo{
    void m1();
}

interface D2{
    void m1();
    void m2();
}
public class LambdaExpressions {
    public static void main(String[] args) {
        Demo obj=()->{                 //LAMBDA EXPRESSION
            System.out.println("hiii");
        };
        obj.m1();
        //No need to create another class implementing interface.

        //Anonymous Class
        D2 ob=new D2() {
            @Override
            public void m1() {
                System.out.println("first");
            }

            @Override
            public void m2() {
                System.out.println("second");
            }
        };
        ob.m2();
    }
}
