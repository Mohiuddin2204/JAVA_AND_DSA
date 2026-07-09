class Employee{          //cannot be public, as can be only one public class in a java file
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
}
public class FirstClass {
    public static void main(String[] args) {
//        Employee e1= new Employee();
//        e1.id=1; e1.name="ABC";
//        System.out.println(e1.getId());
//        System.out.println(e1.getName());
//        e1.printD();
        Employee e2=new Employee();
        e2.setId(4); e2.setName("XYZ");
        e2.printD();
    }
}
