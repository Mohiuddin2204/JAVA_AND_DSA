package Advanced;
/**
 * This is java doc demonstration
 * This is <i>itlaic</i>
 * word <p>paragraph</p>
 * @author Mohiuddin
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html">Java Docs</a>
 */

public class JavaDocs {
    /**
     *
     * @param a first arg
     * @param b second arg
     * @throws Exception if a is zero
     * @return sum of 2 integers
     * @deprecated it is deprecated use +
     * this is addition method
     */
    public int add(int a,int b) throws Exception {
        if(a==0){
            throw new Exception();
        }
        return a+b;
    }

    /**
     *
     * @param args arguments to command line
     */
    public static void main(String[] args) throws Exception {
        System.out.println("main method");
        JavaDocs jd=new JavaDocs();
        int c= jd.add(2,3);
        System.out.println(c);
    }
}
