package BitManipulation;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n=21;
        int c=0;
        while(n!=0){
            n=n&(n-1);    // removes the rightmost set bit
            c++;
        }
        System.out.println("c = "+c);
        // Decimal to Binary Conversion
        n=21;
        String s="";
        while(n!=0){
            if((n%2)==1){
                s=s+"1";
            }
            else{
                s=s+"0";
            }
            n=n/2;
        }
        StringBuilder sb=new StringBuilder(s);
        String str=sb.reverse().toString();
        System.out.println("Binary : "+str);
    }
}
