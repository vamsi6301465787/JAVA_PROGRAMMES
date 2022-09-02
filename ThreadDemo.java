

// class GoodMorning extends Thread
// {	
// 	public void run()
// 	{		
// 		try	
// 		{		
// 			int i=0;		
// 			while(i<5)		
// 			{			
// 				sleep(100);			
// 				System.out.println("Good Morning");			
// 				i++;		
// 			}	
// 		}		
// 		catch(Exception e){}
					
// 	}
// }
// class Hello extends Thread
// {
// 	public void run()	
//     {	
//     	try	
//     	{		
//     		int i=0;		
//     	     while(i<5)		
//     	     {				
//     	     	sleep(200);			
//     	     	System.out.println("Hello");			
//     	     	i++;		
//     	     }
//     	}	
//     	catch(Exception e){	}	
//     }
// }
// class Welcome extends Thread
// {
// 	public void run()
// 	{		
// 		try	
// 		{		
// 			int i=0;	
// 			while(i<5)		
// 			{			
// 				sleep(300);	
// 				System.out.println("Welcome");			
// 				i++;		
// 			}	
// 		}		
// 		catch(Exception e){}	
// 	}
// }  
// class ThreadDemo
// { 
// 	public static void main(String[] args)
// 	{		
// 		GoodMorning j=new GoodMorning();
// 		Hello s=new Hello();	
// 		Welcome g=new Welcome();	
// 		j.start();	
// 		s.start();		
// 		g.start();	
// 	}
// }