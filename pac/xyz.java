package pac;

interface abc
{
	void sum(int x,int y);

}

interface pqr
{
	void sub(int x,int y);
	
}

public class xyz implements abc,pqr
{
	public void sum(int x,int y)
	{
		System.out.println("Sum Is:"+(x+y));
	}
	public void sub(int x,int y)
	{
		System.out.println("Sub Is:"+(x-y));
	}
}