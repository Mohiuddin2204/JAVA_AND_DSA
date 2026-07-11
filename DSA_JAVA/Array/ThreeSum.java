package Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] a={-1,0,1,2,-1,-4};
        int sum=0;
        Arrays.sort(a);
        List<List<Integer>> all=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            int j=i+1;int k=a.length-1;
            while(j<k){
                int s=a[i]+a[j]+a[k];
                if(s<sum){
                    j++;
                }
                else if(s>sum){
                    k--;
                }
                else{
                    List<Integer> l=new ArrayList<>();
                    l.add(a[i]);l.add(a[j]);l.add(a[k]);
                    all.add(l);
                    j++;k--;
                    while(j<k && a[j]==a[j-1]){
                        j++;
                    }
                    while(((k+1)<a.length) &&  j<k && a[k]==a[k+1]){
                        k--;
                    }
                }
            }
        }
        System.out.println(all);
    }
}
