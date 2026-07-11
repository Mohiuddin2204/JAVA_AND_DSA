package BinarySearch;

public class PeakElement {
    public static int peak(int[] a){
        int n=a.length;
        if(n==1){
            return a[0];
        }
        if(a[0]>a[1]){    // decreasing sorted
            return a[0];
        }
        if(a[n-1]>a[n-2]){   // sorted array
            return a[n-1];
        }
        int l=1; int h=n-2; // trimmed down search space
        while(l<=h) {
            int m = (l + h) / 2;
            if (a[m] > a[m - 1] && a[m] > a[m + 1]) {
                return a[m];
            } else if (a[m] > a[m - 1]) {  // increasing part
                l = m + 1;
            } else if (a[m] > a[m + 1]) {
                h = m - 1;
            } else {
                l = m + 1;  // can go anywhere if suppose we have multiple peaks
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,5,1};
        System.out.println(peak(a));
    }
}
