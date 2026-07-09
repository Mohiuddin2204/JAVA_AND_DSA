public class Strings {
    public static void main(java.lang.String[] args) {
        String a=new String("Bye");   //class
        System.out.println(a.length());
        System.out.printf("this is class string %s",a);
        String x="Hello";        //datatype
        System.out.println();
        System.out.println(x.indexOf('l'));
        System.out.println(x.lastIndexOf('l'));
        String tr="    f  f   ";
        System.out.println(tr.trim());  //removes starting and ending spaces
        System.out.println(x.substring(1,4)); //index : [1,4)
        System.out.println(x.contains("ll"));
        String m="Bengaluru";
        System.out.println(m.charAt(5));
        System.out.println(m.replace('u','o'));

        System.out.println(x.equals("Hello"));    //checks values
    }
}
