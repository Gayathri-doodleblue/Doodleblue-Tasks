package calculator;

public interface Reverse {
	public int rev(int a);

}
class Reverseimp implements Reverse
{
	public int rev(int n)
	{
		//int n=;
		int rem,reverse=0;
		for (int i=0;i!=n;)
		{
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		return reverse;
	}
}
