import java.util.Scanner;
public class Natural {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter the Inital Number: ");
	int i = sc.nextInt();
	System.out.print("Enter the Last Number: ");
	int n = sc.nextInt();
	System.out.println("The Natural numbers between 100 to 200 are: ");
	while(i<=n){
		System.out.println(i);
		i++;
        }
   }
}