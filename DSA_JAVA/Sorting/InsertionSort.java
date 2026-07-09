package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={7,8,3,1,2};
        for(int i=1;i<a.length;i++){
            int c=a[i];
            int j=i-1;
            while(j>=0 && c<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=c;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
