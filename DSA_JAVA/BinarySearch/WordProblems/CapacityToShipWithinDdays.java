package BinarySearch.WordProblems;

public class CapacityToShipWithinDdays {
    // weights array of each load = 1 2 3 4 5 6 7 8 9 10 , days=5
    // finding the least capacity to ship all these in given days
    // suppose c=15 => day 1= 1+2+3+4+5 done , day 2= 6+7 , day 3= 8 , d4 =9 , d5= 10 ( done )
    // max can be sum of loads , min is maximum of loads(as to ship everyone)
    public static int sum(int[] a){
        int s=0;
        for(int i:a){
            s+=i;
        }
        return s;
    }
    public static int max(int[] a){
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }
    public static int f(int[] a,int m){
        // return no of days for a capacity
        int d=1;int s=0;
        for(int i:a){
            if(s+i >m){
                s=i;d++;
            }
            else{
                s+=i;
            }
        }
        return d;
    }
    public static void main(String[] args) {
        int[] w={1,2,3,4,5,6,7,8,9,10}; int days=5;
        int l=max(w); int h=sum(w); int cap=sum(w);
        while(l<=h){
            int m=(l+h)/2;
            int d=f(w,m);
            if(d<=days){
                cap=m; h=m-1;
            }
            else{
                l=m+1;
            }
        }
        System.out.println(cap); // can return l
    }
}
