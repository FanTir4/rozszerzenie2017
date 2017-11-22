import java.util.Scanner;

public class sumowanie_while {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	int number;
	int suma = 0;
	
	do
	{
		System.out.print("Podaj liczbê");
		number = scanner.nextInt();
		suma = suma +number;
		System.out.println("suma:" +suma);
		
	
	}while(number !=0);
	
	}
}

