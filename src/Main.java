import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        String menuChoice = "";
        String menu = "D - Democrat R - Republican I - Independent";
        System.out.println("What is your political affiliation?\nD - Democrat R - Republican I - Independent");
        if( scan.hasNext() )
        {
            menuChoice = scan.next();
            if( menuChoice.equalsIgnoreCase( "D" ) )
            {
                System.out.println( "You chose Democratic Donkey" );
            }
            else if( menuChoice.equalsIgnoreCase( "R" ) )
            {
                System.out.println( "You chose Republican Elephant" );

            }
            else if( menuChoice.equalsIgnoreCase( "I" ) )
            {
                System.out.println( "You chose Independent Individual" );
            }
            else
            {
                System.out.println("ERROR\nYou entered " + menuChoice + "\nYou must choose R,D, or I");
            }
        }


    }
}