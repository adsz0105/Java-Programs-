import java.util.Scanner;
public class Msum {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();
	int sum = 0; 
	for(int i = 1; i<=10; i++) {
		sum += n*i;
	}
	System.out.printf("The sum of products is %d\n", sum);
	sc.close();
   }
}