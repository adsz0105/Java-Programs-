import java.util.Scanner; 
public class Sum {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter the intial number: ");
	int i = sc.nextInt();
	System.out.print("Enter the final number: ");
	int n = sc.nextInt();
	int sum = 0;
	while(i<=n){
		if(i%2 == 0){
			sum = sum + i;
		}
		i++;
	}
    System.out.println("The sum of even numbers is: " + sum);
    sc.close();
    }
}
		
		
	