package Array;

public class Merge2SortedArraysInPlace {
    public static void main(String[] args) {
        int[] a1={1,3,5,7,0,0,0,0,0}; // a1 has space of m+n but initially has m elements
        int[] a2={0,2,6,8,9};
        int m=4; int n=a2.length; int k=m+n-1;
        int i=m-1; int j=n-1;
        while(j>=0){
            if(i>=0 && a1[i]>a2[j]){
                a1[k--]=a1[i--];
            }
            else{
                a1[k--]=a2[j--];
            }
        }
        for(int el:a1){
            System.out.print(el+ " ");
        }
    }
}
