package Array;
//OPTIMAL ONE IS REVERSING APPROACH (for inplace)
//rev(a,a+d) , rev(a+d,a+n) , rev(a,a+n)
public class LeftRotateByK {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int k=3;
        int n=a.length;
        k=k%n;
        //store first 3 in a temp
        int[] t=new int[k];
        for(int i=0;i<k;i++){
            t[i]=a[i];
        }
        //move 4,5,6,7 to starting
        for(int i=k;i<n;i++){
            a[i-k]=a[i];
        }
        //insert temp at last
        for(int i=n-k;i<n;i++){
            a[i]=t[i-(n-k)];
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
