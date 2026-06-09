import java.util.Scanner;
public class Sum { 
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the numbers: ");
	float [] marks = new float[5];
	float sum = 0;
	
	for(int i = 0; i<marks.length;i++) {
		marks[i] = sc.nextFloat();
	}

	for(float elements: marks){
		sum = sum + elements;
	}
	System.out.print("The total sum of the array is: " + sum);
	System.out.println(" ");
	sc.close();
   }
} 