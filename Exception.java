public class Exception {
    static void function() throws IllegalAccessException
    {
        System.out.println("inside the the function ");
        throw new IllegalArgumentException("demo");
    }
    public static void main(String args[])
    {
        try{
            function();

        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught in main ");
        }
        finally
        {
            System.out.println("vamsi.. ");
        }
    }
}
