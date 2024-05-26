
public class Mesal3 {

    public static void main(String[] args) {
        String str = "Computer science is a dynamic science." ;
        String str2 ="science" ;
        int a , b ;
        a = faza(str) ;
        System.out.println("Mryam Amiriparsa.\n"
                + "string is: "+ str);
        System.out.println("number of blanks is: "+ a) ;
        b = tekrar(str , str2) ;
        System.out.println("*****");
        System.out.println("string is: "+str);
        System.out.println("str2 is: "+str2) ;
        System.out.println("str2 iterates "+b+
                " times in str.") ;
    }
    public static int faza(String str) {
        int a=0 ;
        int index = str.indexOf(' ') ;
        while(index>=0 )
        {
            a++ ;
            index= str.indexOf(' ', index +1);
        }
        return a ;
    }
    public static int tekrar(String str , String str2 ){
        int b=0 ;
        int index = str.indexOf(str2) ;
        while(index>=0)
        {
            b++ ;
            index = str.indexOf(str2 , index+1) ;
        }
        return b ;
    }
}
