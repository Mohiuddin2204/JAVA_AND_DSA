package String;
import java.util.HashMap;

public class IsomorphicStrings {
    // Example :  egg = add ( e=a , g=d )
    public static boolean iso(String s1,String s2){
        if(s1.length()!=s2.length()){return false;}
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(hm.containsKey(s1.charAt(i))){
                if(!hm.get(s1.charAt(i)).equals(s2.charAt(i))){
                    return false;
                }
            }
            else if(hm.containsValue(s2.charAt(i))){
                return false;
            }
            hm.put(s1.charAt(i),s2.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(iso("egg","add"));
        System.out.println(iso("foo","bar"));
    }
}
