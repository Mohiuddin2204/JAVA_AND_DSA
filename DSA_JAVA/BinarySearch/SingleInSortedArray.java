package BinarySearch;

public class SingleInSortedArray {
    //ARRAY CONTAINING 1 ELEMENT = RETURN IT
    //CHECK CARE FOR FIRST AND LAST ELEMENT IF AS SINGLE
    public static int sisa(int[] a){
        int n=a.length;
        if(n==1){
            return a[0];
        }
        if(a[0]!=a[1]){
            return a[0];
        }
        if(a[n-1]!=a[n-2]){
            return a[n-1];
        }
        int l=1; int h=a.length-2; //TRIM DOWN SPACE AS CHECKED FOR FIRST AND LAST
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]!=a[m+1] && a[m]!=a[m-1]){
                return a[m];
            }
            if((m%2==1 && a[m-1]==a[m]) || (m%2==0 && a[m+1]==a[m])){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3,4,5,5,6,6};
        // EVEN ODD INDEX APPROACH
        // LEFT OF 4(SINGLE) => EVEN ODD PAIRS
        // RIGHT OF 4(SINGLE) => ODD EVEN PAIRS
        System.out.println(sisa(a));
    }
}
