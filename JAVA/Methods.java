public class Methods {
    //VAR ARGS
    static int sumvarargs(int ...a){         //no need of create object in main (static)
        int r=0;
        for(int i:a){
            r=r+i;
        }
        return r;
    }
    int sum(int a ,int b){
        int c=a+b;
        return c;
    }
    int sum(int a,int b,int c){           //OVERLOADING
        return a+b+c;
    }
    static int fib(int n) {              //recursion : fibonacci => 0,1,1,2,3,5,8,...
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Methods m=new Methods();
        System.out.println(sumvarargs(11,55));
//        System.out.println(m.sum(1,2));
//        System.out.println(fib(6));
        // System.out.println(m.sum(2,3,4));
    }
}
