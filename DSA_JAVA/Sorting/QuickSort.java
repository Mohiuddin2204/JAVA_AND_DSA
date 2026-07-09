package Sorting;

public class QuickSort {
    public static int piv(int[] a,int l,int r){
        int pivot=a[l];
        int start=l; int end=r;
        while(start<end){
            while(a[start]<=pivot && start<r){
                start++;
            }
            while(a[end]>pivot && end>l){
                end--;
            }
            if(start<end){
                int t=a[start];
                a[start]=a[end];
                a[end]=t;
            }
        }
        int t=a[l];
        a[l]=a[end];
        a[end]=t;
        return end;
    }
    public static void quicksort(int[] a,int l ,int r){
        if(l<r){
            int pivot=piv(a,l,r);
            quicksort(a,l,pivot-1);
            quicksort(a,pivot+1,r);
        }
    }
    public static void main(String[] args) {
        int[] a={6,3,9,5,2,8};
        quicksort(a,0,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
