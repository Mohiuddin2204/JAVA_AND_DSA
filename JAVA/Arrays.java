public class Arrays {
    public static void main(String[] args) {
//        int[] a=new int[6];     by default stores zeroes
//        for(int i:a){
//            System.out.println(i);
//        }
        // a.length
        //FOR EACH
//        int[] n={1,2,3,4,5};
//        for(int i:n){
//            System.out.println(i);
//        }
        //2D ARRAY
        int[][] a= new int[5][5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=i*j;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //reverse an array
        int[] ra={2,4,5,6,8};
        int n=ra.length;
        int j= (n/2);
        for(int i=0;i<j;i++){
            int t=ra[i];
            ra[i]=ra[n-i-1];
            ra[n-i-1]=t;
        }
        for(int i:ra){
            System.out.print(i+" ");
        }

        //check sorted or not
        int[] sa={2,3,4,6,6};
        for(int i=1;i<sa.length;i++){
            if(sa[i]<sa[i-1]){
                System.out.println("not sorted");break;
            }
            if(i==(sa.length-1)){
                System.out.println("sorted");
            }
        }

    }
}
