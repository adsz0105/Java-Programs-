import java.util.Scanner;
public class Conversion {
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);

	float m = 0.621371f;
	System.out.print("Enter KM's: ");
	float km = sc.nextFloat();
	float ans = km*m;
	System.out.printf("The converted value from Km's to miles is: %.3f%n", ans);
	
	sc.close();
    }
}

	
	
