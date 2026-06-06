import java.util.Scanner;
public class Pass {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	float totalObtained = 0;
	boolean passedAllSubjects = true;

	System.out.print("Enter the number of subjects: ");
	int n = sc.nextInt();

	for(int i = 1; i<=n; i++) {
	System.out.print("Subject: " +i);
	System.out.print("\nEnter the obtained marks: ");
	float ObtainedMarks = sc.nextFloat();
	totalObtained += ObtainedMarks;

	if(ObtainedMarks < 33){
		passedAllSubjects = false;
	  }
        }

        float avg = totalObtained/n;
	System.out.println("\nYour Overall percentage is: " + avg);
	if(avg>=40 && passedAllSubjects){
		System.out.println("\nCongratulations, you have been promoted");
	} 
	else {
		System.out.println("\nSorry, You are not been promoted");
	}
	sc.close();
   }
}