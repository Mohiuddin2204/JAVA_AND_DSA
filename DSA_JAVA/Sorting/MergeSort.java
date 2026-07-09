package Sorting;
import java.util.ArrayList;

public class MergeSort {
    public static void merge(int[] a,int l,int m,int h){
     int left=l; int right=m+1;
        ArrayList<Integer> t=new ArrayList<>();
        while(left<=m && (right)<=h){
            if(a[left]<=a[right]){
                t.add(a[left]);
                left++;
            }
            else{
                t.add(a[right]);
                right++;
            }
        }
        while(left<=m){
            t.add(a[left]); left++;
        }
        while(right<=m){
            t.add(a[right]); right++;
        }
        for(int i=l;i<=h;i++){
            a[i]=t.get(i-l);
        }
        return;
    }
    public static void mergesort(int[] a, int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
       mergesort(a,low,mid);
        mergesort(a,mid+1,high);
       merge(a,low,mid,high);

    }
    public static void main(String[] args) {
        int[] a={5,3,2,4,1};
        mergesort(a,0,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
