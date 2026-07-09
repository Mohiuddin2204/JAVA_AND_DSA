package Array;

public class MaximumSubarrayProduct {
    public static void main(String[] args) {
        int[] a={3,6,0,-1,-1,0,4,-1,2};
        int p=1; int s=1; int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(p==0){
                p=1;
            }
            if(s==0){
                s=1;
            }
            p=p*a[i];
            s=s*a[a.length-i-1];
            max=Math.max(max,p);
            max=Math.max(max,s);
        }
        System.out.println("max: "+max);
    }
}
