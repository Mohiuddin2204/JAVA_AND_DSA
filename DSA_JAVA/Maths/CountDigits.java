package Maths;

public class CountDigits {
    public static void main(String[] args) {
        int n=1234;
        int c=(int)Math.log10(n) + 1;
        int k=String.valueOf(n).length();
        System.out.println(c);
        System.out.println(k);
    }
}
