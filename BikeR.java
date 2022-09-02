import java.util.Scanner;
public class BikeR {
    
    static void Race(float sp1,float sp2,float sp3,float sp4,float sp5)
    {
        float avg=(sp1+sp2+sp3+sp4+sp5)/5;
        if(avg>sp1)
        {
            System.out.println("sp1 q");
        }
        else{
            System.out.println("sp1 n");
        }
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);

      System.out.println("sp1 : ");
      float sp1,sp2,sp3,sp4,sp5;
      sp1=s.nextFloat();
      
      System.out.println("sp2 : ");
      sp2=s.nextFloat();
      
      System.out.println("sp3 : ");
      sp3=s.nextFloat();
      
      System.out.println("sp4 : ");
      sp4=s.nextFloat();
      
      System.out.println("sp5 : ");
      sp5=s.nextFloat();
      
      s.close();
      Race(sp1,sp2,sp3,sp4,sp5);

    }


}
