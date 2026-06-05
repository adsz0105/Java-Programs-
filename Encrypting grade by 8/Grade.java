import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Grade:");
		char grade = sc.next().charAt(0);
                
                char encryptedGrade = (char)(grade + 8);
		System.out.println("Encrypted Grade: " + encryptedGrade);
	
		char decryptedGrade = (char)(encryptedGrade - 8);
		System.out.println("Decrypted Grade: " + decryptedGrade);

		sc.close();
	}
}
