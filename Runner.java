import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a dividend number: ");
		float d1 = Float.valueOf(in.nextLine());

		System.out.print("Enter the divisor: ");
		float d2 = Float.valueOf(in.nextLine());

		Quotient q = (f1, f2) -> {
			return (f1/f2);
		};

		System.out.printf("%1.3f%n", q.divide(d1, d2));

    	System.out.println();

		System.out.println("Enter num: ");
		int userNum = new Scanner(System.in).nextInt();

		PerfectSquare perfectSquare = (num) -> Math.pow((int) Math.sqrt(num), 2) == num;

		System.out.println(perfectSquare.isPerfectSquare(userNum));

	}
}

//PartnerB Learned GitKraken + lambda
/*
Partner A:
I learned how to use functional interfaces and lamba functions to implement the interface.
I also learned how to use github and GitKraken as a way to collaborate.
*/