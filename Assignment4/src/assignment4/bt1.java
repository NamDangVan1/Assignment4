package assignment4;



public class bt1 
{
    public static boolean check(int num)
    {
        return num % 2 == 0;
    }
    
    public static void main(String[] args) 
    {
        int o = 0,e = 0;
        for ( int i = 1; i <= 100; i++ )
        {
            if ( check( i ) )
            {
                e+=i;
            }else{
                o+=i;
            }
        }
        System.out.println("sum of even: " + e);
        System.out.println("sum of odd: " + o);
        
    }
    
}
