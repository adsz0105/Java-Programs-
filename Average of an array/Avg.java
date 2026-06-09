import java.util.Scanner;
public class Avg { 
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number of elements in the array: ");
	int n = sc.nextInt();
		
	System.out.print("Enter the marks: ");
	float [] marks = new float [n];
	for(int i=0; i<marks.length; i++) {
		marks[i] = sc.nextFloat();
	}

	float sum = 0.0f;
	for(float elements:marks) {
		sum += elements;
	}
	System.out.print("The value of average marks is: " + sum/n);
	System.out.print("\n");
	sc.close();
   }
}