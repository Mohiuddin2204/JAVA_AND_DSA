public class Switch {
    public static void main(String[] args) {

    // switch takes only int or string as input in switch()
        int age=4;
        switch(age){
            case 18:
                System.out.println("adult");
                break;
            case 4:
                System.out.println("child");
                break;
            default:
                System.out.println("bye");
        }

        //enhanced switch => no need of break;
        String var="hye";
        switch(var){
            case "hii" -> {
                System.out.println("hi");
            }
            case "hye" -> {
                System.out.println("hoye");
            }
            default -> {
                System.out.println("boyee");
            }
        }


//        int a=11;
//        if(a=11){           mandatory relational operator (not like C )
//            System.out.println("aa");
//        }
//        else{
//            System.out.println("nb");
//        }
    }
}
