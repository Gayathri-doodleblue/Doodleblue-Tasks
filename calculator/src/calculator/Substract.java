package calculator;

public interface Substract {
	public int sub(int a,int b);
	public int sub(int a,int b,int c);

}
class Subimp implements Substract
{
public int sub(int a,int b)	
{
	return a-b;
}
public int sub(int a,int b,int c)	
{
	return a-b-c;
}
}

