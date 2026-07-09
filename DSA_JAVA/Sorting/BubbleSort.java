package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={7,8,3,1,2};
        for(int i=0;i<a.length-1;i++){
            int swap=0;
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    swap=1;
                }
            }
            if(swap==0){
                break;
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
