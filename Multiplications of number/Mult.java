import java.util.Scanner; 
public class Mult { 
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
	for(int i=0; i<=10; i++){
		System.out.println(n + " x " + i + " = " + n * i);
	}
	sc.close();
    }
}