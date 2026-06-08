import java.util.Scanner;
public class Fact {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = sc.nextInt();
	int i = 1;
	long factorial = 1;
	while(i<=num) {
    		factorial *= i;
		i++;
		}
	System.out.printf("The Factorial of %d is %d", num, factorial);
	sc.close();
	}
}