package assignment4;

public class bt3 
{
    public static void main(String[] args) 
    {
        System.out.print("Prime: ");
        for ( int i = 1; i <= 100; i++ )
        {
            int test = 0;
            if (i < 2){
                continue;
            }
            for ( int j = 2; j < i/2 + 1; j++ )
            {
                if ( i % j ==0 )
                {
                    test += 1;
                    break;
                }
            }
            if ( test == 0 )
            {
                System.out.print( i + ", ");
            }
        }
    }
}
