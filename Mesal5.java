
public class Mesal5 {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer ("salam") ;
        System.out.println("Maryam Amiriparsa.\n"
                + "str before calling the method: "+str);
        method(str) ;
        System.out.println("str bad az method: "+str) ;
    }
    public static void method(StringBuffer str2)
    {
        System.out.println("in mthod: str2 "
                + "before changing its value: "+str2);
        str2.append(" emtehan") ;
        System.out.println("in method: str2 after "
                + "changing its value: "+str2) ;
    }
}
