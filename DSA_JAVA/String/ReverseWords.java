package String;

public class ReverseWords {
    public static void main(String[] args) {
        String s="Hello hi nice day";
        // converting this into => day nice hi Hello
        String[] a=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]);sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
