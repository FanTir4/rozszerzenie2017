import java.util.Scanner;

public class Liczba {

	public static void main(String[] args) {





		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbê:");
		int numer = scanner.nextInt();
		scanner.close();
		int suma = 0;


		for(int i=0 ; i<=numer ;  i++)
		{
			System.out.print( i + ",");
			suma = suma + i ;
		}
		
		System.out.print("\nSuma wynosi: " +suma);

	}






}


