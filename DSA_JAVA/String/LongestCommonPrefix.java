package String;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        Arrays.sort(strs); // will only need to check first and last strings
        int i=0;
        String s1=strs[0]; String s2=strs[strs.length-1];
        String ans="";
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                ans+=s1.charAt(i);
                i++;
            }
            else {
                break;
            }
        }
        System.out.println(ans);
    }
}
