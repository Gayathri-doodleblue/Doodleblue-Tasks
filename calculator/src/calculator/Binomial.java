package calculator;

public interface Binomial {
	public int binomial(int n);

}
class Binomialimp implements Binomial
{
	public int binomial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
			}
	
}