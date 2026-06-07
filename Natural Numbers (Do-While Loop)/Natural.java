import java.util.Scanner;
public class Natural {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the start number: ");
	int i = sc.nextInt();
	System.out.print("Enter the last number: ");
	int n = sc.nextInt();
	System.out.println("The Natural numbers between " + i + " to " + n + " are: ");
	do{
	  System.out.println(i);
	  i++;
        } while (i<=n);
   }
}