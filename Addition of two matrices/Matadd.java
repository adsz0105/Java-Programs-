import java.util.Scanner;
public class Matadd { 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of rows: ");
	int r = sc.nextInt();
	System.out.print("Enter the number of columns: ");
	int c = sc.nextInt();
	
	float [][] a = new float [r][c];
	float [][] b = new float [r][c];
	float [][] sum = new float [r][c];

	System.out.print("Enter the elements of the first matrix: ");
	for(int i=0; i<r; i++) {
		for(int j=0; j<c; j++){
			a[i][j] = sc.nextFloat();
		}
	}

	System.out.print("Enter the elements of the second matrix: ");
	for(int i=0; i<r; i++) {
		for(int j=0; j<c; j++){
			b[i][j] = sc.nextFloat();
		}
	}

	System.out.println("Sum of Matrices: ");
	for(int i=0; i<r; i++) {
		for(int j=0; j<c; j++){
			sum[i][j] = a[i][j] + b[i][j];
			System.out.print(sum[i][j] + " ");
		}
		System.out.println();
	}
	sc.close();
   }
}


	
