
class Fib 
{

     
    static void fib(int n1,int n2,int count)
    {
       for(int i=2;i<=count;++i)
       {
          int sum =n1+n2;
          System.out.print(" "+sum);
          n1=n2;
          n2=sum;
       }
    }

        public static void main()
        {
            int n1=0,n2=1,count=10;
            System.out.print(n1+" "+n1);
            fib(n1,n2,count);
        }
    
    
}
