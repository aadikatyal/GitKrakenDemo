import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		System.out.println("Enter num: ");
		int userNum = new Scanner(System.in).nextInt();
		
		PerfectSquare perfectSquare = (num) -> Math.pow((int) Math.sqrt(num), 2) == num;
		
		System.out.println(perfectSquare.isPerfectSquare(userNum));
	}
}