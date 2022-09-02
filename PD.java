import java.util.Scanner;
public class PD
{
	public static void main(String[] args)
	{
		System.out.print("Enter the byte value: ");
		Scanner sc=new Scanner(System.in);
		byte b;
		b=sc.nextByte();
		System.out.print("Enter the short value: ");
		short s;
		s=sc.nextShort();
		System.out.print("Enter the int value: ");
		int i;
		i=sc.nextInt();
		System.out.print("Enter the long value: ");
		long l;
		l=sc.nextLong();
		System.out.print("Enter the boolean value: ");
		boolean bo;
		bo=sc.nextBoolean();
		System.out.print("Enter the double value: ");
		double d;
		d=sc.nextDouble();
		System.out.print("Enter the float value: ");
		float f;
		f=sc.nextFloat();
        sc.close();
		System.out.println("byte default value = "+b);
		System.out.println("short default value = "+s);
		System.out.println("int default value = "+i);
		System.out.println("long default value = "+l);
		System.out.println("boolean default value = "+bo);
		System.out.println("double default value = "+d);
		System.out.println("float default value = "+f);
		
	}
}