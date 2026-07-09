package Advanced;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File myF=new File("file.txt");    //CREATING FILE
        try{
            myF.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    //WRITING IN FILE
        //multiplication table
        int j=5;
        String table=" ";
        for(int i=1;i<=10;i++){
            table += j+"X"+i+"="+ (i*j);
            table+="\n";
        }
        try{
            FileWriter fw=new FileWriter("file.txt");
            fw.write("hiiii");
            fw.write("\n");
            fw.write(table);
            fw.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    //READING FILE
        try{
            Scanner sc=new Scanner(myF);
            while(sc.hasNextLine()){
                String l=sc.nextLine();
                System.out.println(l);
            }
            sc.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        //DELETION
//        if(myF.delete()){
//            System.out.println("deleted"+myF.getName());
//        }
//        else{
//            System.out.println("bye some error occured while deleting file");
//        }
    }
}