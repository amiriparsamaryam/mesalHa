
public class stringFormatter {
    public static String chap (String s , int w)
    {
        final int stringLength = s.length() ;
        if(stringLength>=w)
        {
            return s ;
        }
        else 
            return space(w-stringLength) .
                    insert(0 , s).toString();
    }
    public static String rast(String s , int w)
    {
        final int stringLength= s.length() ;
        if(stringLength>=w)
        {
            return s ;
        }
        else 
            return space(w-stringLength) .
                    insert(0 , s).toString();
    }
    public static String markaz(String s , int w)
    {
        final int stringLength= s.length() ;
        if(stringLength>=w)
        {
            return s ;
        }
        else 
        {
            final int numSpase =w-stringLength ;
            final int leftSpace = numSpase/2 ,
                    righSpace = numSpase-leftSpace ;
            return space(leftSpace).append(s) .
                    append(space(righSpace)).toString();
        }
    }
    private static StringBuffer space(int numSpace)
    {
        if (numSpace <= 0) 
                return new StringBuffer() ;
        else 
        {
            StringBuffer space = new StringBuffer () ;
            for (int i=0 ; i<numSpace ; i++ )
                space.append(' ');
            return space ;
        }
    }
}
