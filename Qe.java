import java.util.Scanner;
public class Qe 
{

    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a value :");
       double a=s.nextDouble();
       System.out.println("Enter b value :");
       double b=s.nextDouble();
       System.out.println("Enter c value :");
       double c=s.nextDouble();
       s.close();
       double d=b*b-(4.0*a*c);
       if(d>0.0)
       {
          double r1=(-b+Math.pow(d,0.5)/2.0*a);
          double r2=(-b-Math.pow(d,0.5)/2.0*a);
          System.out.println("Enter roots are :"+r1+" "+r2);
          System.out.println("the roots are real and equal ");

        }
        else if(d==0.0)
        {
            double r1= -b/2.0*a;
            System.out.println("Enter roots are :"+r1);
            System.out.println("the roots are real and unequal ");

        }
        else 
        {
            System.out.println("Enter roots are not real :");
        }

    }
    
}
