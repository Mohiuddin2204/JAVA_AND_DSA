package BinarySearch;
// UNIQUE ELEMENTS IN ARRAY
public class SearchInRSA {
    public static void main(String[] args) {
        int[] a={7,8,9,1,2,3,4,5,6};
        int x=1;
        int l=0; int h=a.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==x){
                System.out.println(m); return;
            }
            if(a[l]==a[m] && a[m]==a[h]){  // for duplicates problem=> shrink search place
                l++;h--; continue;
            }
            if(a[l]<=a[m]){
                if(a[l]<=x && x<=a[h]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(a[m]<=x && x<=a[h]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
        System.out.println("not found");
    }
}
