package Packages.p2;

import Packages.p1.A;  // should be in same folder then only can access
public class Using {
    public static void main(String[] args) {
        System.out.println("Using = in Packages.p1");
        A a=new A();
        a.p();  //using imported custom package
    }
}
