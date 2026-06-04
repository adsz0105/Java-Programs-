import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float totalObtained = 0;
        float totalMaximum = 0;

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nSubject " + i);

            System.out.print("Enter maximum marks: ");
            float maxMarks = sc.nextFloat();

            System.out.print("Enter marks obtained: ");
            float obtainedMarks = sc.nextFloat();

            totalMaximum += maxMarks;
            totalObtained += obtainedMarks;
        }

        float percentage = (totalObtained / totalMaximum) * 100;

        System.out.println("\nTotal Obtained Marks = " + totalObtained);
        System.out.println("Total Maximum Marks = " + totalMaximum);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}