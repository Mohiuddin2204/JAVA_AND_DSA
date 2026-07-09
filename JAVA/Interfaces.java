interface Bicycle{            // interface contains only empty body methods
    int a=45;  // final
    void A();
    void B();
}
interface Human{
    void C();
    default void D(){         //can have default methods, need not have implemented in Bike
        System.out.println("hii");     //add new functionality in existing...
    }
    private void E(){         //cannot implement in Bike
        System.out.println("byee");
    }
}
class Bike implements Bicycle,Human{     // Multiple interface supported, but not multiple inheritance
    public void A(){             // must be public
        System.out.println("a");
    }
    public void B(){
        System.out.println("b");
    }
    public void sound(){             //other methods
        System.out.println("horn");
    }
    public void C(){
        System.out.println("humann");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.A();
        b.B();
        b.sound();
        b.C();
       // b.a=454;  cannot change , as interface variables are final
        b.D();
       // b.E(); error , not allowed
    }
}
