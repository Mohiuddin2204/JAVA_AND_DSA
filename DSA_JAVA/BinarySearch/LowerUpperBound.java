package BinarySearch;
// CEIL = LOWER BOUND :   a[i]>=x
// UPPER BOUND : a[i]>x
// FLOOR :   a[i]<=x
public class LowerUpperBound {
    public static int lb(int[] a,int k){
        int l=0 ; int h= a.length-1;
        int ans=a.length;
        while(l<=h){
            // int m= l + (h-l)/2; => stopping from overflow
            int m=(l+h)/2;
            if(a[m]>=k){
                ans=m; h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public static int ub(int[] a,int k){
        int l=0 ; int h= a.length-1;
        int ans=a.length;
        while(l<=h){
            // int m= l + (h-l)/2; => stopping from overflow
            int m=(l+h)/2;
            if(a[m]>k){
                ans=m; h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={3,4,6,6,6,7,9,12,16,17};
        int k=6;
        int lb=lb(a,k);
        if(lb==a.length){
            System.out.println("no lower bound");
        }
        else{
            System.out.println("index : "+lb+" element : "+a[lb]);
        }
        int ub=ub(a,k);
        if(ub==a.length){
            System.out.println("no lower bound");
        }
        else{
            System.out.println("index : "+ub+" element : "+a[ub]);
        }
    }
}
