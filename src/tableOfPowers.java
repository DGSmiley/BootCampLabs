import java.util.Scanner;

public class tableOfPowers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// While loop to continue if user want
		String choice = "yes";
		while (choice.equals("yes")){
		System.out.print("Enter an integer: ");
		int x = input.nextInt();
	
		// Header	
		String header = "Number" + "\t " + "Squared" + "\t" + "Cubed" + "\n"
		+ "=====" + "\t " + "=====" + "\t " + "=====";
		System.out.println(header);
		
		// For Loop to find Powers
		for (int i = 1; i <= x; i++){
			System.out.println(i + "\t " + (i*i) + "\t " + (i*i*i));
		}
			
		System.out.println("Do you wish to continue? (yes or no)");
		choice = input.nextLine();
		choice = input.nextLine();
		}
	}
}
