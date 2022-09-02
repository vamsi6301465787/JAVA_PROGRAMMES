import java.util.Scanner;
class Bubble
{
   void sort(int a[])
   {
       int i,j,temp;
       for(i=0;i<a.length-1;i++)
       {
           for(j=0;j<a.length-1;j++)
           {
               if(a[j]>a[j+1])
               {
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
       }
       for( i=0;i<a.length;i++)
       {

           System.out.println(a[i]);
       }

   }
}
 class BubbleSort
{
    public static void main(String args[])
    {
        int a[]=new int[4];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        
        Bubble b=new Bubble();
        b.sort(a);

    }
}




// class Bubble
// {
// 	void Sort(int a[])
// 	{
// 		int i,j,temp;
// 		for(i=0;i<a.length-1;i++)
// 		{
// 			for(j=0;j<a.length-1;j++)
// 			{
// 				if(a[j]>a[j+1])
// 				{
// 					temp=a[j];
// 					a[j]=a[j+1];
// 					a[j+1]=temp;
// 				}
// 			}
// 		}
// 		for(i=0;i<a.length;i++)
// 		{
// 			System.out.println(a[i]);
// 		}
// 	}
// }
// public class BubbleSort{
// 		public static void main(String[] args) {
// 			int[] a = {2,1,4,3};
// 			Bubble b = new Bubble();
// 			b.Sort(a);
// 	}
// }