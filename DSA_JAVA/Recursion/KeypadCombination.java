package Recursion;

public class KeypadCombination {
    public static String[] keyp={
            ".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"
    };
    public static void keypc(String s,int i,String comb){
        if(i==s.length()){
            System.out.print(comb+" ");
            return;
        }
        char c=s.charAt(i);
        String map=keyp[c-'0'];
        for(int j=0;j<map.length();j++){
            keypc(s,i+1,comb+map.charAt(j));
        }
    }
    public static void main(String[] args) {
        String str="23";
        keypc(str,0,"");
    }
}
