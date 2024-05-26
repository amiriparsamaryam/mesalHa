
public class Masal10 {

    public static void main(String[] args) {
        String str = "hello ali" ;
        int w = 15 ;
        String s = stringFormatter.chap(str, w) ;
        System.out.println("Maryam Amiriparsa \nchap string= "+s);
        s = stringFormatter.rast(str, w);
        System.out.println("rast string= "+s) ;
        s= stringFormatter.markaz(s, w) ;
        System.out.println("markaz string= "+s) ;
    }
    
}
