class MyEmployee{          //cannot be public, as can be only one public class in a java file
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void printD(){
        System.out.println("My id is "+ id +"\n" + "My name is "+ name);
    }
    public void setId(int i){
        id=i;
    }
    public void setName(String n) {
        name = n;
    }
    public MyEmployee(){                                //no arg constructor
        id=10;name="mm";
    }
    public MyEmployee(int i,String n){                //arg constructor
        id=i;name=n;
    }
    public MyEmployee(MyEmployee me){                 //copy constructor
        this.id=me.id;this.name=me.name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        MyEmployee e=new MyEmployee();  //automatic invoked
        e.printD();
        MyEmployee e2=new MyEmployee(11,"ss");
        e2.printD();
        MyEmployee e3=new MyEmployee(e2);
        e3.printD();
    }
}
