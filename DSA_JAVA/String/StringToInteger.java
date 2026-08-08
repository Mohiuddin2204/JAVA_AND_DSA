package String;

public class StringToInteger {
    public static int strToInt(String s){
        // If string starts with any alphabet , return 0
        //If string starts with some numbers then return them
        s=s.trim();
        int num=0; char[] c=s.toCharArray();
        if(c.length==0){return 0;}
        int i=0;int sign=1;
        char curr=c[i];
        if(curr=='-'){sign=-1;i++;}
        else if(curr=='+'){i++;}
        for(;i<c.length;i++){
            curr=c[i];
            if(curr<'0' || curr>'9'){break;}
            else{
                num*=10;
                num+=curr-'0';
                if(sign*num <= Integer.MIN_VALUE){return Integer.MIN_VALUE;} // boundary cases
                else if(sign*num >= Integer.MAX_VALUE){return Integer.MAX_VALUE;}
            }
        }
        return (int)(num*=sign);
    }
    public static void main(String[] args) {
        String s1="   -42"; String s2="words 987";String s3="4193 words";
        System.out.println(strToInt(s1));
        System.out.println(strToInt(s2));
        System.out.println(strToInt(s3));
    }
}
