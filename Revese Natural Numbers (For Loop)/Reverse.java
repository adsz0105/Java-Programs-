import java.util.Scanner;
public class Reverse { 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the starting number: ");
	int n = sc.nextInt();
	System.out.println("The natural numbers in reverse order are: ");
	for(int i = n; i>0; i--) {
		System.out.println(i);
	}
	sc.close();
    }
}