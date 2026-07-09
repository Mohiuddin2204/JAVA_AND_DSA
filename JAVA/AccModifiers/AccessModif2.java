package AccModifiers;

class subclass extends C{
    public void printing(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);// can access as it is same direct package AccModifiers...
        //   System.out.println(a);  No access in subclass for private
    }
}
public class AccessModif2 {
    public static void main(String[] args) {
    subclass sc=new subclass();
    sc.printing();
    }
}
