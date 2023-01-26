import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static final double PI = 3.14159;

	public static void main(String[] args) {
		// Display menu
		System.out.println("Calculations");
		System.out.println("1. Calculate area of a square");
		System.out.println("2. Calculate area of a circle");
		System.out.println("3. Display palindromes up to 1,000");
		// Get input
		System.out.print("Enter an option: ");
		int option = scanner.nextInt();
		if(option >= 1 && option <= 3) {
			switch(option) {
				case 1: {
					System.out.println("\n**** Area of a square ****");
					System.out.print("Enter width of square (cm): ");
					int width = scanner.nextInt();
					System.out.println("The area of a square of " + width + "cm = " + areaSquare(width) + "cm squared");
					break;
				}
				case 2: {
					System.out.println("\n**** Area of a circle ****");
					System.out.print("Enter radius of circle (cm): ");
					double radius = scanner.nextDouble();
					System.out.println("The area of a square of " + radius + "cm = " + areaCircle(radius) + "cm squared");
					break;
				}
				case 3: {
					System.out.println("\n**** Palindromes ****");
					for(int i = 0; i <= 1000; i++) {
						if(isPalindrome(i)) {  //101 33 22 111   34445   54443      2 2 1 1  1122
							System.out.println(i);
						}
					}
					break;
				}
			}
		} else {
			System.out.println("Invalid option");
		}
	}

	private static boolean isPalindrome(int num) {
		String str = Integer.toString(num);
		String reverse = "";
		for(Character s : reverse.toCharArray()) {

		}

		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return str.equals(reverse);
	}
	
	private static int areaSquare(int width) {
		return width * width;
	}
	
	private static double areaCircle(double radius) {
		return PI * (radius * radius);
	}

}
