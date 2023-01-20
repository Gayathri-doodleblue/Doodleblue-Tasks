package calculator;

public interface Mul {
	public int mul(int a,int b);
	public int mul(int a,int b,int c);

}
class Mulimp implements Mul {
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int mul(int a,int b,int c)
	{
		return a*b*c;
	}
	
}
