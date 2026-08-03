package String;

public class ZFunction {
    //first occurrence of 'String b' in 'String a', return starting index in a
    public static int zfunc(String a,String b){
        int m=a.length(); int n=b.length();
        for(int i=0;i<=(m-n);i++){
            if(a.charAt(i)==b.charAt(0)){
                if(a.startsWith(b, i)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String a="sadbutsad"; String b="sad";
        System.out.println(zfunc(a,b));
    }
}
