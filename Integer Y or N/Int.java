import java.util.Scanner;
public class Int {
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter a number: ");
	boolean n = sc.hasNextInt();
	System.out.println(n);
	
	sc.close();
    }
}

	
	
