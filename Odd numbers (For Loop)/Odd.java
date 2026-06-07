import java.util.Scanner;
public class Odd {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter the needed odd numbers (from 0): ");
	int n = sc.nextInt();
	System.out.println("The odd numbers are: ");
	for(int i = 0; i<n; i++){
		System.out.println(2*i+1);
	} 
   }
}