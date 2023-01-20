package calculator;

public interface Division {
	public int div(int a,int b);
	public int div(int a,int b,int c);
	
}
class Divimp implements Division
{
	public int div(int a,int b)
	{
		return a/b;
	}
	public int div(int a,int b,int c)
	{
		return a/b/c;
	}
}
