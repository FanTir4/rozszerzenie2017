import java.util.Scanner;

public class sprawdzanie_czy__powstanie_trojkat {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		
		
		
		
			System.out.print("Podaj liczbê");
			number1 = scanner.nextInt();
			System.out.print("Podaj liczbê");
			number2 = scanner2.nextInt();
			System.out.print("Podaj liczbê");
			number3 = scanner3.nextInt();
			scanner.close();
			
			
			
			
		if((number1 > 0) && (number2 > 0) && (number3 > 0) && 
				(number1 + number2 > number3) && (number3 + number2 > number1) && (number1 + number3 > number2))
		{
			System.out.println("Z tych liczb powstanie trójk¹t");
		}
		
		else
		{
			System.out.println("Z tych liczb nie powstanie trójk¹t");
		}
			

			
			
			
			
		
		
		
		}
	
	

}
