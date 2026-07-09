package Array;
//SORT in order of 0's , 1's , 2's
public class Sort012 {
    public static void main(String[] args) {
        //DUTCH NATIONAL FLAG ALGORITHM
        int[] a={0,1,2,0,1,2,1,2,0,0,0,1};
        //THREE POINTER
        // 0's : 0 to low-1  ,  1's : low to mid-1 , mid to high:unsorted , high+1 to n-1 : 2's
        int l=0;int m=0;int h=a.length-1;
        //swap mid with low , if mid is zero , l++,m++
        //if mid is one , mid go ahead: m++
        //swap mid with high , if mid is two , h--
        while(m<=h){
            if(a[m]==0){
                int t=a[l];
                a[l]=a[m];
                a[m]=t;
                l++;m++;
            }
            else if(a[m]==1){
                m++;
            }
            else{
                int t=a[m];
                a[m]=a[h];
                a[h]=t;
                h--;
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
