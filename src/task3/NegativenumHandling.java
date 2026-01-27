package task3;

public class NegativenumHandling {

	public static void main(String[] args) {
		        int a = -4;
		        int b = -7;

		        if (a<0 && b<0) {
		            System.out.println("Both numbers are negative");
		            System.out.println("a = " + a + ", b = " + b);
		       
		        } else if(a<0 || b<0){
		        	System.out.println("One number is negative one number is positive");
		            System.out.println("a = " + a + ", b = " + b);
		        } else {
		        	System.out.println("Both numbers are positive");
		        }

	}

}
