package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a={1,3,4,10,11,2,11,10,2};
        int l=a[0];int sl=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(a[i]>l){
                sl=l;l=a[i];
            }
            else if(a[i]<l && a[i]>sl){
                sl=a[i];
            }
           // System.out.println("l"+l+" "+"sl"+sl);
        }
        System.out.println("sl:"+sl);
    }
}
