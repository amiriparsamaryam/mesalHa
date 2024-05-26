
public class Masal1 {

    public static void main(String[] args) {
        double rad=45.0 ,a=5.0 ,b=6.5 ,deg=90 ,c=-5.36 ;
        int adad ,x=10 ,y=20 ;
        System.out.println("Maryam Amiriparsa. \n cos(" +
                rad + ") =" + Math.cos(rad));
        System.out.println("pow("+a+","+b+") =" +
                Math.pow(a, b)); 
        System.out.println("max("+x+","+y+") =" +
                Math.max(x, y));
        System.out.println("min("+x+","+y+") ="+
                Math.min(x, y)) ;
        System.out.println("sqrt("+y+") ="+Math.sqrt(y));
        System.out.println("round("+b+") ="+Math.round(b));
        System.out.println("ceil("+c+") ="+Math.ceil(c));
        System.out.println("floor("+c+") ="+Math.floor(c));
        System.out.println("toradians("+deg+") ="+Math.toRadians(deg));
        System.out.println("exp("+a+") ="+Math.exp(a));
        System.out.println("generate 5 int random numbers less"
                + " than or equa 5:");
        for(int i=1 ; i<=5 ; i++)
        {
            adad= (int)(5*Math.random()) ;
            System.out.println("adad"+i+"="+adad) ;
        }
    }
    
}
