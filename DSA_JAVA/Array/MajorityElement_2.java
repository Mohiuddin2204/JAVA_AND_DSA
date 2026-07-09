package Array;
import java.util.ArrayList;
//ELEMENT MORE THAN N/3 TIMES APPEARING IN ARRAY
//THERE WILL BE EXACTLY TWO ELEMENTS IN ARRAY
public class MajorityElement_2 {
    public static void main(String[] args) {
        int[] a={1,1,1,3,3,2,2,2};
        int c1=0;int c2=0;int e1=0;int e2=0;
        for(int i=0;i<a.length;i++){
            if(c1==0 && e2!=a[i]){
                c1=1; e1=a[i];
            }
            else if(c2==0 && e1!=a[i]){
                c2=0;  e2=a[i];
            }
            else if(a[i]==e1){
                c1++;
            }
            else if(a[i]==e2){
                c2++;
            }
            else{
                c1--; c2--;
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        c1=0;c2=0;
        for(int i=0;i<a.length;i++){
            if(e1==a[i]){
                c1++;
            }
            if(e2==a[i]){
                c2++;
            }
        }
        int maj=(a.length/3)+1;
        if(c1>=maj){
            al.add(e1);
        }
        if(c2>=maj){
            al.add(e2);
        }
        System.out.println(al);
    }
}
