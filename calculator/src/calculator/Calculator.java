package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Add add=new Addimp();
		Substract sub=new Subimp();
		Mul mul=new Mulimp();
		Division div=new Divimp();
		Reverse rev=new Reverseimp();
		SquareRoot square=new Squareimp();
		Random1 random=new Randomimp();
		Binomial binomial=new Binomialimp();
		System.out.println("Enter the operation \n1:Add\n2:sub\n3:mul\n4:Div\n5:Reverse a Integer\n6:Random number\n7:Squareroot\n8:Binomial");
		int operation=sc.nextInt();
		switch(operation)
		{
		case 1 :
		{
		//System.out.println(add.add(4,4));
		System.out.println("Addition of  numbers is "+add.add(4,4,3));
		
		break;
		}
		case 2:
		{
		System.out.println("Subtraction of  numbers is "+sub.sub(5,3,4));
		break;
		}
		case 3:
		{
		System.out.println("Multipliction of  numbers is "+mul.mul(5,3,4));
		break;
		}
		case 4:
		{
		System.out.println("Division of "
				+ " numbers is "+div.div(100,50,2));
		break;
		}
		case 5:
		{
			System.out.println("Enter the number to reverse ");
		System.out.println("The Reversed number is "+rev.rev(sc.nextInt()));
		break;
		}
		case 6:
		{
			System.out.println("Enter the  Max and Min number");
			
			System.out.println("The Random number is "+random.random(sc.nextInt(),sc.nextInt()));
			
			
		break;
		}
		case 7:
		{
			System.out.println("Enter the Number to find the Square root");
		System.out.println("the Square root of a the given number is "+square.squareroot(sc.nextDouble()));
		break;
		}
		case 8:
		{
			System.out.println("enter the number to find the binomial");
		System.out.println("The bionomial of a given number is "+binomial.binomial(sc.nextInt()));
		break;
		}
		}
	}

}
