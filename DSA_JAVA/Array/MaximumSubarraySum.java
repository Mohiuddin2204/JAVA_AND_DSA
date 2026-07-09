package Array;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        //KADANE's ALGORITHM
        int[] a={-2,-3,4,-1,-2,1,5,-3};
        int sum=0;int max=Integer.MIN_VALUE;
        int anss=0;int anse=0;int s=0;
        for(int i=0;i<a.length;i++){
            if(sum==0){
                s=i;
            }
            sum+=a[i];
            if(sum>max){
                max=sum;
                anss=s;anse=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("sum="+max);
        System.out.println("subarray:");
        for(int i=anss;i<=anse;i++){
            System.out.print(a[i]+" ");
        }
    }
}
