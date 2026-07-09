package BitManipulation;

public class MinBitsFlipsToConvert {
    public static void main(String[] args) {
        int start=3;int goal=4;
        //To convert 3 to 4, no of bits to flip will be =>
        // No of set bits in their XOR
        int n=start^goal;
        int c=0;
        while(n!=0){
            n=n&(n-1);    // removes the rightmost set bit
            c++;
        }
        System.out.println("c = "+c);
    }
}
