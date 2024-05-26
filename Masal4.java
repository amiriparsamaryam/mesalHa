
public class Masal4 {

    public static void main(String[] args) {
        String str = "salam" ;
        System.out.println("Maryam Amiriparsa.\n"+
                "str berfterer :) az method: "+str );
        method(str) ;
        System.out.println("str arfterer :) az method :"+str);
    }
    public static void method(String str)
    {
        System.out.println("in method : str berfterer :) "
                + "changing its value : "+str) ;
        str = "bye" ;
        System.out.println("in methode : str arfterer :) "
                + "changing its value : "+ str) ;
    }
    

    
}
