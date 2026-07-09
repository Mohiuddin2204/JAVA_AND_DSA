package Recursion;
import java.util.ArrayList;
//print factorial numbers less than N using recursion
public class FactNumbersLessThanN {
    static ArrayList<Integer> factN(int n){       //to return list
        ArrayList<Integer> al=new ArrayList<>();
        genF(1,2,n,al);
        return al;
    }
    static void genF(int cf,int i,int n,ArrayList<Integer> al){    //recursion function
        if(cf>n){
            return;
        }
        al.add(cf);
        genF(cf*i,i+1,n,al);
    }
    public static void main(String[] args) {
        int n=250;
        ArrayList<Integer> al=new ArrayList<>();
        al=factN(n);
        System.out.println(al);
    }
}
