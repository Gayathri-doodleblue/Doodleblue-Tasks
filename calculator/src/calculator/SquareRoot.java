package calculator;

public interface SquareRoot {
public double squareroot(double a);
}
class Squareimp implements SquareRoot
{
	public double squareroot(double a)
	{
		return Math.sqrt(a);
	}
}
