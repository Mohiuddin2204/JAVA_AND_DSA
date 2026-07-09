public class PatternRecur {

    static void patt(int n){                         //right tri
        if(n>0){
            patt(n-1);
            for(int i=1;i<=n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patt2(int n){                //reverse right tri
        if(n>0){
            for(int i=1;i<=n;i++){
                System.out.print("* ");
            }
            System.out.println();
            patt2(n-1);
        }
    }
    public static void main(String[] args) {
        patt(5);
        System.out.println();
        patt2(5);
    }
}
