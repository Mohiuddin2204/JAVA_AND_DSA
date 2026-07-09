package Maths;
import java.util.*;
// Time complexity = O(root n)+ O(dlogd) where n=input , d=no of divisors
public class Divisors {
    public static void main(String[] args) {
        int n=36;
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                l.add(i);
                if((n/i)!=i){
                    l.add(n/i);
                }
            }
        }
        Collections.sort(l);
        System.out.println(l);
    }
}