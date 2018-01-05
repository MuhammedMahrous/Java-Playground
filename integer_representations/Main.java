package integer_representations;
/* this is a test class for the IntegerConverter class that uses command line as UI
 * @author Muhammed Mahrous
 * */
class Main
{
    public static void main( String[] args )
    {
    	// loose validation to check that at least three strings were passed to the application
        if( args.length == 3 )
        {

            int base = Integer.valueOf( args[0] );            
            String prefix = args[1];
            int num = Integer.valueOf( args[2] );            

            // simply pass the required base (any int value) and the 
            IntegerConverter myConverter = new IntegerConverter( base, prefix );

            System.out.println( myConverter.toBase( num ) );
        }
        else
        {
            System.out.println("ERROR WRONG_FORMAT ! PLEASE ENTER [ INTEGER_BASE PREFIX_STRING INTEGER_VALUE ] \n PROGRAM EXITING...");

        }
        
    }
}
