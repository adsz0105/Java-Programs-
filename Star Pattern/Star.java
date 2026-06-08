import java.util.Scanner; 
public class Star { 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of rows: ");
	int n = sc.nextInt();
	int i = n;
	while (i>0){
		int j = 0;
		while(j<i){
			System.out.print(" * ");
			j++;
		}
	   i--;
	   System.out.println(" ");
	}
	sc.close();
   }
}