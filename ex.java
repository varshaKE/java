public class ex
{
    static void checkage(int age)
    {
        try
        {
            if(age<18)
            {
                throw new Exception("access denied");
            }

            else
            {
                System.out.println("access granted");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        checkage(15);
    }
}