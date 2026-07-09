package BitManipulation;

public class XOR_In_a_Range {
    public static int xor(int n){
        if(n%4 ==1){
            return 1;
        }
        else if(n%4 ==2){
            return n+1;
        }
        else if(n%4 ==3){
            return 0;
        }
        return n;
    }
    public static void main(String[] args) {
        // XOR from 1 to N numbers pattern :
        // Do N%4 and  for remainders 1,2,3,0 => 1 , N+1 , 0 N
        int l=4; int r=6;
        System.out.println(xor(l-1)^xor(r));
    }
}
