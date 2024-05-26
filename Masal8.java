import java.text.* ;
public class Masal8 {

    public static void main(String[] args) {
        NumberFormat a = NumberFormat.getNumberInstance() ;
        a.setMaximumFractionDigits(5);
        System.out.println("Maryam Amiriparsa \ntruncated PI= "+
                a.format(Math.PI));
        a.setMinimumIntegerDigits(4);
        System.out.println("truncated PI="+
                a.format(Math.PI));
        NumberFormat pul = NumberFormat.getCurrencyInstance();
        System.out.println("pul simbol usege = "+
                pul.format(3.53));
        NumberFormat darsad = NumberFormat.getPercentInstance();
        System.out.println("darsad simbol usege = "+
                darsad.format(0.353));
        DecimalFormat formatting =
                (DecimalFormat)NumberFormat.getNumberInstance() ;
        formatting.setDecimalSeparatorAlwaysShown(true);
        System.out.println("show decimal point always: "+
                formatting.format(3.0));
        formatting.setDecimalSeparatorAlwaysShown(false);
        System.out.println("not show decimal point always"+
                formatting.format(3.0));
    }
    
}
