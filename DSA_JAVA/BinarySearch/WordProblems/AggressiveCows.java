package BinarySearch.WordProblems;
import java.util.Arrays;
//if cows>length of array => not possible case
public class AggressiveCows {
    // stall coordinates array : 0 3 4 7 9 10 , cows=4
    // place 4 cows such that , min dist between cows is maximum    ( MAX(MIN) )
    // 0    3   4   7   9   10
    //c1        c2  c3      c4   => min dist is 3 (which is max of all cases)
    public static boolean canweplace(int[] a,int m,int cows){
        int ccows=1;int coord=a[0];  // coord maintaining last cow coordinates
        for(int i=1;i<a.length;i++){
            if(a[i]-coord >=m){
                ccows++; coord=a[i];
            }
        }
        if(ccows>=cows){ return true;} // if we can place cows with the min dist mid , can return true
        return false;
    }
    public static void main(String[] args) {
        int[] a={0,3,4,7,10,9}; int cows=4;
        Arrays.sort(a); // sort as checking consecutive wise
        int l=1; int h=a[a.length-1]-a[0]; int d=a[a.length-1]-a[0];
        while(l<=h){
            int m=(l+h)/2;
            if(canweplace(a, m, cows)){
                l=m+1; d=m;
            }
            else {
                h=m-1;
            }
        }
        System.out.println(d);  // can return h
    }
}
