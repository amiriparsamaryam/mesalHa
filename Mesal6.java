
public class Mesal6 {

    public static void main(String[] args) {
        int x , y ;
        Integer adad1 , adad2 ;
        adad1 =8 ;
        adad2 = 16 ;
        System.out.println("Maraym Amiriparsa. \n"
                + "adad1= "+adad1+" , adad2= "+adad2);
        x = 2*adad1 +adad2 ;
        y = adad1 + adad2 ;
        System.out.println("x = "+x+ " , y = "+y) ;
        String s = new String("12" );
        x = Integer.parseInt(s );
        x = s + adad1.toString() + adad2.toString() ;
        System.out.println("convert int to string and concate : "+s) ;
    }
    
}
