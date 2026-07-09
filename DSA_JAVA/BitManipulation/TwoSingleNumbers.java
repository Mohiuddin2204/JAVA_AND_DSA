package BitManipulation;
// In an array there are two numbers repeating once , remaining all repeating twice
public class TwoSingleNumbers {
    public static void main(String[] args) {
        int[] a={2,4,2,14,3,7,7,3};
        // Two buckets method
        int xor=0;
        for(int i:a){
            xor=xor^i;
        }
        // xor will be 14^4 = 10
        // 10 => 1010
        int right=(xor&(xor-1))^xor;
        // 1010 => 0010 , rightmost set bit will be extracted
        int b1=0;int b2=0;
        // In b2 , set bit = 0 ones will be xorred
        // In b1 , set bit = 1 ones will be xorred
        // As two single numbers are different , they will be placed in different buckets
        for(int i=0;i<a.length;i++){
            if((a[i]&right)!=0){
                b1=b1^a[i];
            }
            else{
                b2=b2^a[i];
            }
        }
        System.out.println(b1+" "+b2);
    }
}
