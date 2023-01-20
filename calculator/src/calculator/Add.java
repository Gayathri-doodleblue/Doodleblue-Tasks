package calculator;

  public interface Add {
	  public int add(int a,int b);
	  public int add(int a,int b,int c);
	  
	  
	 
}
 class Addimp implements Add
 {
	 public int add(int a,int b)
	 {
		 //int a ,b,c;
		return a+b;
	 }
	 public int add(int a,int b,int c)
	 {
		 return a+b+c;
	 }
 }

