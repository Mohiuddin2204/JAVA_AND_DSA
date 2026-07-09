package Array;
//REMOVE DUPLICATES FROM SORTED ARRAY
//PRINT NO OF UNIQUE NUMBERS
//IN THE ARRAY , GET UNIQUE ONES AT START THEN AFTER THAT CAN BE ANYTHING IN ARRAY
// a= 0,0,1,1,2,3,3,3,4
//PRINT K=5 , a=0,1,2,3,4,_,_,_,_;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a={0,0,1,1,2,3,3,4};
        //TWO POINTER
        int k=1;int t=a[0];int idx=0;
        for(int i=1;i<a.length;i++){
            if(a[i]!=t){
                t=a[i];
                idx++;
                a[idx]=a[i];k++;
            }
        }
        System.out.println("k="+k);
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}