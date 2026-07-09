package Array;
import java.util.ArrayList;
//USING MERGE SORT ALGORITHM FOR OPTIMAL TIME COMPLEXITY
public class CountInversions {
    public static int merge(int[] a,int l,int m,int h){
        int cnt=0;int left=l; int right=m+1;
        ArrayList<Integer> t=new ArrayList<>();
        while(left<=m && (right)<=h){
            if(a[left]<=a[right]){
                t.add(a[left]);
                left++;
            }
            else{
                t.add(a[right]);
                cnt+=(m-left+1); // important line for this problem
                /* DURING MERGING OF ARRAYS , AS BOTH ARE SORTED=> IF PARTICULAR
                NUMBER IN LEFT SIDE IS GREATER THAN A NUMBER IN RIGHT SIDE THEN THE RIGHT NEIGHBOURS OF LEFT SIDE
                NUMBER WILL ALSO BE GREATER THAN RIGHT SIDE ONE , SO WE INCREASE THE COUNT ACCORDINGLY
                */
                right++;
            }
        }
        while(left<=m){
            t.add(a[left]); left++;
        }
        while(right<=m){
            t.add(a[right]); right++;
        }
        for(int i=l;i<=h;i++){
            a[i]=t.get(i-l);
        }
        return cnt;
    }
    public static int mergesort(int[] a, int low,int high){
        int cnt=0;
        if(low>=high){
            return cnt;
        }
        int mid=(low+high)/2;
        cnt+=mergesort(a,low,mid);
        cnt+=mergesort(a,mid+1,high);
        cnt+=merge(a,low,mid,high);
        return cnt;
    }
    public static void main(String[] args) {
        int[] a={5,3,2,4,1};
        System.out.println(mergesort(a,0,a.length-1));
    }
}
