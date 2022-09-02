public class ThSyDemo 
{
    public static void main(String args[])
    {
       CallMe cm=new CallMe();
       Caller obj1=new Caller(cm,"hell");
       Caller obj2=new Caller(cm,"hell00");
       Caller obj3=new Caller(cm,"hell00000");
       try {
          obj1.t.join();
          obj2.t.join();
          obj3.t.join();
        
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Interrupted");
        }
    }
}
class CallMe
{
    void Call(String msg)
    {
        try{
            Thread.sleep(800);

        }
        catch (InterruptedException e) 
        {
            System.out.println("Interrupted");
        }
        System.out.println("["+msg+"]");
    }
}

class Caller implements Runnable
{ 
    Thread t;
    CallMe target;
    String msg;

  public  Caller(CallMe targ ,String s )
  {
    target =targ;
    msg=s;
    t=new Thread(this);
    t.start();
  }
  public void run()
  {
    synchronized(target)
    {
        target.Call(msg);
    }
  }
  
}