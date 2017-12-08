import java.util.Scanner;

public class rysunek {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int number1;
		int number2;
		
		    System.out.print("Podaj liczbê");
			number1 = scanner.nextInt();
			System.out.print("Podaj liczbê");
			number2 = scanner.nextInt();
			scanner.close();
		
		
		
		
	for(int i =0; i<number1; i++)
	{
	for(int j = 0; j<number2; j++)
	{
	System.out.print("#");
	}
	
	System.out.println();
	}

	}

}
