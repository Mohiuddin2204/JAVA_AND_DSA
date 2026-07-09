package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={7,8,3,1,2};
        for(int i=0;i<a.length-1;i++){
            int small=a[i]; int k=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<small){
                    small=a[j]; k=j;
                }
            }
            int t=a[i];
            a[i]=a[k];
            a[k]=t;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
