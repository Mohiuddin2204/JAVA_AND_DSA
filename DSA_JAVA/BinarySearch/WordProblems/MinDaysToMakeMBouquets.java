package BinarySearch.WordProblems;

public class MinDaysToMakeMBouquets {
    // Each index : each flower time to bloom
    // m: bouquets , k: adjacent flowers required , m bouquets with k adjacent flowers in them
    // m*k > N : return -1 (impossible case)
    public static int max(int[] a){
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }
    public static int min(int[] a){
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<m){
                m=a[i];
            }
        }
        return m;
    }
    public static boolean bouq(int[] a,int mid,int m,int k){
        int c=0;int b=0;
        for(int i:a){
            if(i<=mid){
                c++;
            }
            else{
                b+= c/k; c=0;
            }
        }
        b+= c/k; //for last ones in array
        if(b>=m){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] bloom={7,7,7,7,13,11,12,7}; int m=2; int k=3; int ans=max(bloom);
        if(m*k > bloom.length){
            System.out.println("impossible"); return;
        }
        int l=min(bloom); int h=max(bloom);
        while(l<=h){
            int mid=(l+h)/2;
            if(bouq(bloom,mid,m,k)==true){
                ans=mid; h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(ans); // can return l also: as answer is at l
    }
}
