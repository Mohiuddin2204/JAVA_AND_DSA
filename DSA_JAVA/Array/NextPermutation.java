package Array;

public class NextPermutation {
    //REVERSE SUB-ARRAY IN AN ARRAY
    public static void rev(int[] a,int l,int r){
       while(l<r){
           int t=a[l];
           a[l]=a[r];
           a[r]=t;
           l++;r--;
       }
    }
    public static void main(String[] args) {
        int[] a={2,1,5,4,3,0,0};
        int ind=-1;
        for(int i=a.length-2;i>=0;i--){
            if(a[i]<a[i+1]){
                ind=i;break;
            }
        }
        if(ind==-1){
            rev(a,0,a.length-1); return;
        }
        for(int i=a.length-1;i>ind;i--){
            if(a[i]>a[ind]){
                int t=a[i];
                a[i]=a[ind];
                a[ind]=t;
                break;
            }
        }
        rev(a,ind+1,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }

    }
}
