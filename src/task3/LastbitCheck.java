package task3;

public class LastbitCheck {

	public static void main(String[] args) {
		
                int num = 22;   
		        if ((num & 1) == 0) {
		            System.out.println("Last bit is 0 → 0 is even");
		        } else {
		            System.out.println("Last bit is 1 → 0 is odd");
		        }
	}
}
		    
