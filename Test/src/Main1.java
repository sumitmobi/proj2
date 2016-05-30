import java.util.Arrays;
import java.util.List;

public class Main1
{

    public static void main( String [] args )
    {
        // TODO Auto-generated method stub
        String str = "asdad1, strt2, werwerwe, a ,";
        
        List< String > list = Arrays.asList( str.split( "\\s*,\\s*" ) );
        //List< String > list = Arrays.asList( str.split( "[\\s,]+" ) );
        System.out.println( list );
    }

}
