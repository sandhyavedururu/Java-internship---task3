package task3;
import java.util.Scanner;
public class EvenOddchecker {

	public static void main(String[] args) {
		int staticNumber=27;
		checkAndPrint(staticNumber);
		Scanner scanner=new Scanner(System.in);
		System.out.print("\nEnter an integer:"); 
		int userNumber = scanner.nextInt();
		checkAndPrint(userNumber);
		scanner.close();
	}
	
	private static void checkAndPrint(int number){
		String result=(number%2==0)?"Even":"Odd";
		System.out.printf( "%d is %s\n",number,result);

	}
}
