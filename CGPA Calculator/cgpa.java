import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float totalObtained = 0;
	float calc = 9.525f;	

	System.out.print("Enter the number of subjects:");
	int n = sc.nextInt();
	
	for(int i=1;i<=n;i++) {
	System.out.println("\nSubject " +i);
	System.out.println("Enter the obtained marks: ");
	float obtainedMarks = sc.nextFloat();
       	totalObtained += obtainedMarks;
      }
	float total = n*calc;
        float cgpa = totalObtained/total;
        System.out.println(cgpa);
    }
}