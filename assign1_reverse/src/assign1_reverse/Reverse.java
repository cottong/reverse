package assign1_reverse;

//includes the Scanner class 
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// message to tell user to enter an integer
		System.out.println("Enter an integer then press enter:");
		int value = input.nextInt();
		int reverseValue = 0;
		
		//while loop that takes value and reverses i
		while (value != 0) {
			reverseValue = reverseValue * 10;
			reverseValue = reverseValue + (value % 10);
			value = value / 10;
		}
		// prints to console the reverse of the integer the user entered
		System.out.println("The reverse of the integer you've entered is: "
				+ reverseValue);

	}

}

