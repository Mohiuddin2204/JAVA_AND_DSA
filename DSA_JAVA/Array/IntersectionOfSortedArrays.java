package Array;

import java.util.ArrayList;

public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,4};
        int[] b={1,1,2,2,2,3};
        int n=a.length;int m=b.length;int i=0;int j=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(i<n && j<m){
            if(a[i]>b[j]){
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                if(!al.isEmpty() && al.getLast()!=a[i]){
                    al.add(a[i]);
                }
                if(al.isEmpty()){
                    al.add(a[i]);
                }
                i++;j++;
            }
        }
        System.out.println(al);
    }
}
