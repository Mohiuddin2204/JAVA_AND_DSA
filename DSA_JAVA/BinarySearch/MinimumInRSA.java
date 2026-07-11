package BinarySearch;

public class MinimumInRSA {
    public static void main(String[] args) {
        int[] a={4,5,6,7,0,1,2};
        int ans=Integer.MAX_VALUE;
        int l=0;int h=a.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[l]<=a[m]){
                if(a[l]<ans){
                    ans=a[l];
                }
                l=m+1;
            }
            else{
                if(a[m]<ans){
                   ans=a[m];
                }
                h=m-1;
            }
        }
        System.out.println("min : "+ ans);
    }
}
