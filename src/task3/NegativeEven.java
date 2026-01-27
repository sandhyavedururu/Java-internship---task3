package task3;

public class NegativeEven {

	public static void main(String[] args) {
		int[] numbers ={-2,-7,-9,8};
		for(int num : numbers) {
			if (num % 2 ==0) {
				System.out.println(num + "is an EVEN number");
				} else{
					System.out.println(num + " is an ODD number");
				}
		}
	}
}
