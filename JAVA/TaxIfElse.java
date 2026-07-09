import java.util.Scanner;

public class TaxIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float income; float tax=0.0f;
        income=sc.nextFloat();
        if(income<=2.5){
            System.out.println("No tax");
        }
        if(income>2.5f && income<=5.0f){
            tax= (income-2.5f)*(5/100.0f);   //5%
        }
        if(income>5.0f && income<=10.0f){
            tax= (2.5f)*(5/100.0f);
            tax=tax+ (income-5.0f)*(0.2f);    //20%
        }
        if(income>10.0f){
            tax= (2.5f)*(5/100.0f);
            tax=tax+(5.0f)*(0.2f);
            tax=tax+ (income-10.0f)*(0.3f);    //30%
        }
        System.out.println("tax : "+tax);
    }
}
