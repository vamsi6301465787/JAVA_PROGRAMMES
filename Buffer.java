public class Buffer {
    public static void main(String args[])
    {
        StringBuffer s1=new StringBuffer("vamsi");
        s1.delete(0,2);
        System.out.println(s1);
        
        StringBuffer s2=new StringBuffer("vamsi");
        s2.delete(0,s2.length());
        System.out.println(s2);

        
        StringBuffer s3=new StringBuffer("vamsi");
        s3.deleteCharAt(4);
        System.out.println(s3);
    }
    
}
