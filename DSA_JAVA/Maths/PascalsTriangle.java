package Maths;
import java.util.*;

public class PascalsTriangle {
    public static List<List<Integer>> print(int n){   //return list of lists
        List<List<Integer>> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> l=genRow(i);
            al.add(l);
        }
        return al;
    }
    public static List<Integer> genRow(int r){        // generate each lists
        int ans=1; List<Integer> l=new ArrayList<>();
        l.add(1);
        for(int i=1;i<r;i++){
            ans=ans*(r-i);
            ans=ans/i;
            l.add(ans);
        }
        return l;
    }
    public static void main(String[] args) {
        List<List<Integer>> al=new ArrayList<>();
        al=print(5);
        System.out.println(al);
    }
}
