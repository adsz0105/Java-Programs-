import java.util.Scanner;
public class Present { 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number of elements in the array: ");
	int n = sc.nextInt();

	System.out.print("Enter the numbers: "); 
	int [] marks = new int [n];
	for(int i=0; i<marks.length;i++){
		marks[i] = sc.nextInt();
	}

	System.out.print("Enter the number to find in the array: ");
	int num = sc.nextInt();

	Boolean isInArray = false;
	for(float element: marks) {
		if(num==element){
			isInArray = true;
			break;
		}
	}
	if(isInArray) {
		System.out.println("The value is present in the array");
	} 
	else { 
		System.out.println("The value is not present in the array");
	}
    }
}