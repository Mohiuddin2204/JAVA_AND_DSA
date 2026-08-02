package String;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s="((()))(())";
        // convert this to =>  (())() -> remove respective outer parentheses
        int c=0; boolean f=true; String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){c++;}
            else if(s.charAt(i)==')'){c--;}
            if(c==1 && f){f=false; continue;} // start of parentheses set
            if(c==0 && !f){f=true; continue;} // end of parentheses set
            if(!f){  // during false => print strings
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
