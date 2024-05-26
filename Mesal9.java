import java.util.* ;
import java.text.* ;
public class Mesal9 {

    public static void main(String[] args) {
        Date now = new Date() ;
        DateFormat a = DateFormat.getDateInstance();
        System.out.println("Maryam Amiriparsa \n"
                + "default date= "+a.format(now));
        a = DateFormat.getDateInstance(DateFormat.SHORT , java.util.Locale.KOREA);
        System.out.println("short(KOREA): "+a.format(now));
        a = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("medium: "+a.format(now)) ;
        a = DateFormat.getDateInstance(DateFormat.LONG) ;
        System.out.println("long: "+a.format(now)) ;
        a = DateFormat.getDateInstance(DateFormat.FULL) ;
        System.out.println("full: "+a.format(now)) ;
    }
    
}
