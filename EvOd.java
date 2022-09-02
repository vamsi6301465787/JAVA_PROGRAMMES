import java.util.Scanner;
public class EvOd {
    public static void main(String args[])
    {
        System.out.println("Énter a number : ");
        Scanner s=new Scanner(System.in);
       
        int num=s.nextInt();
        s.close();
        if(num%2==0)
        {
            
        System.out.println("even number");
        }
        else{
            
        System.out.println("odd");
        }

    }
    
}
