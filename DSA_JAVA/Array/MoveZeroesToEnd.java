package Array;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] a={1,0,2,3,2,0,0,4,5,1};
        int n=a.length;
        //Two POINTER
        //STORE J AT FIRST ZERO
        int j=-1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
    //    if(j==-1){ return; }  No zeroes in array then return
        //SWAP NON-ZERO AND ZERO by sliding zero to right
        for(int i=j+1;i<n;i++){
            if(a[i]!=0){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j++;
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
