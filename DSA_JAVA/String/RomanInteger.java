package String;
import java.util.HashMap;

public class RomanInteger {
    public static int romanToInteger(String s){
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);hm.put('V',5);hm.put('X',10);hm.put('L',50);
        hm.put('C',100);hm.put('D',500);hm.put('M',1000);
        int r=hm.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(hm.get(s.charAt(i))< hm.get(s.charAt(i+1))){
                r-=hm.get(s.charAt(i));
            }
            else{
                r+=hm.get(s.charAt(i));
            }
        }
        return r;
    }
    public static String integerToRoman(int n){
        int[] v={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] r={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder sb=new StringBuilder();
        for(int i=v.length-1;i>=0 && n>0;i--){
            while(n>=v[i]){
                n-=v[i];
                sb.append(r[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(romanToInteger("MCMXCIV"));
        System.out.println(integerToRoman(1994));
    }
}
