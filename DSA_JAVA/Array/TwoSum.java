package Array;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] a={2,6,5,8,11,12};
        int k=14;
        Arrays.sort(a);
        int l=0;int r=a.length-1;
        HashSet<List<Integer>> all=new HashSet<>();
        while(l<r){
            int sum=a[l]+a[r];
            if(sum==k){
                List<Integer> al=new ArrayList<>();
                al.add(a[l]);al.add(a[r]);
                all.add(al);
                l++;
            }
            else if(sum<k){
                l++;
            }
            else{
                r--;
            }
        }
        if(all.isEmpty()){
            System.out.println("no two sum");
        }
        System.out.println(all);
    }
}
