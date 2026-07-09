package Array;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] a={2,5,9,6,9,3,8,9,7,1};
        // HARE AND TORTOISE APPROACH
        int sl=a[0]; int f=a[0];
        //move slow and fast pointer until they meet;
        do{
            sl=a[sl];
            f=a[a[f]];
        } while(sl!=f);
        //now move any of slow/fast to original a[0] and move them one by one until they meet
        f=a[0];
        while(sl!=f){
            sl=a[sl]; f=a[f];
        }
        System.out.println("duplicate: "+ sl);
    }
}
