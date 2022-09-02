class abstruct
{
	public static void main(String args[])
	{
		Find area=new Find();
		{
			area.Triangle(Double.parseDouble(args[0]));
		}
	}
}
abstract class CalArea
{
	abstract void Triangle(Double b);
}
class Find extends CalArea
{
    public void Triangle(Double b)
	{

	}
}