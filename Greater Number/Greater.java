import java.util.Scanner;
public class Greater {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the 1st Number: ");
	float num1 = sc.nextFloat();

	System.out.print("Enter the 2nd Number: ");
	float num2 = sc.nextFloat();

	System.out.println(num1>num2);
	
	sc.close();
    }
}
