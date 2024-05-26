import java.util.* ;
public class Mesal2 {
static Scanner in = new Scanner (System.in) ;
    public static void main(String[] args) {
        System.out.print("Maryam Amiriparsa. \n enter first string: ");
        String resh1 = in.next() ;
        System.out.print("enter second string: ");
        String resh2 =in.next() ;
        if(resh1.compareTo(resh2)==0)
            System.out.println("do reshte shabih hastand.");
        if(resh1.compareTo(resh2)<0)
            System.out.println("resh2 > resh1 .");
        if(resh1.compareTo(resh2)>0)
            System.out.println("resh2 < resh1 .");
            
    }
    
}
