package BinarySearch;

public class MedianOfTwoSortedArrays {
    public static int mergeSolution(int[] a1,int[] a2,int n1,int n2){
        int i=0; int j=0; int n=n1+n2; int id2= n/2; int id1= id2-1;
        int ct=0; int e1=-1; int e2=-1;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                if(ct==id1){e1=a1[i];}
                if(ct==id2){e2=a1[i]; break;}
                ct++; i++;
            }
            else{
                if(ct==id1){e1=a2[j];}
                if(ct==id2){e2=a2[j]; break;}
                ct++; j++;
            }
        }
        while(i<n1){
            if(ct==id1){e1=a1[i];}
            if(ct==id2){e2=a1[i]; break;}
            ct++; i++;
        }
        while(j<n2){
            if(ct==id1){e1=a2[j];}
            if(ct==id2){e2=a2[j]; break;}
            ct++; j++;
        }
        if(n%2 ==1){return e2;}
        return (e1+e2)/2;
    }
    //SYMMETRY APPROACH => PICKING VALID ELEMENTS ON LEFT SIDE
    // 1 , 3 , 4 , 7 , 10 , 12      2 , 3 , 6 , 15
    // total = 10 => 5 on left
    // picking 3 on left and 2 on right =>  1 3 4(l1)  |  7(r1) 10 12
    //                                        2 3(l2)  |  6(r2) 15
    // cross compare :  3 < 7 good , 4<6 good , its valid symmetry
    //median :  largest on left and smallest on right : average
    // elimination in binary search :  l1>r2 : high eliminated
    // l2>r1 : left eliminated
    public static int binarySearchSolution(int[] a1,int[] a2,int n1,int n2){
        //do binary search from shorter arrays
        if(n1>n2){binarySearchSolution(a2,a1,n2,n1);}
        int l=0; int h=n1; int left=(n1+n2+1)/2; // in case of odd, high elements on left
        while(l<=h){
            int m1=(l+h)/2;  // points at r1
            int m2= left-m1; // points at r2
            int l1=Integer.MIN_VALUE; int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE; int r2=Integer.MAX_VALUE;
            if(m1<n1){r1=a1[m1];}
            if(m2<n2){r2=a2[m2];}
            if(m1-1>=0){l1=a1[m1-1];}
            if(m2-1>=0){l2=a2[m2-1];}
            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2 ==1){return Math.max(l1,l2);}
                return (Math.max(l1,l2)+Math.min(r1,r2))/2;
            }
            else if(l1>r2){h=m1-1;}
            else{l=m1+1;}
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a1={2,3,6,15}; int n1=a1.length;
        int[] a2={1,3,4,7,10,12}; int n2=a2.length;
        System.out.println(mergeSolution(a1,a2,n1,n2));
        System.out.println(binarySearchSolution(a1,a2,n1,n2));
    }
}
