import java.util.Scanner;

public class Srednia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

				Scanner scanner = new Scanner(System.in);
			int number;
			int suma = 0;
			int counter = 0;
			int max = Integer.MIN_VALUE;
			
			do
			{
				System.out.print("Podaj liczb�");
				number = scanner.nextInt();
				if(number > max && number !=0) max = number;
				suma = suma +number;
				if(number!=0) counter++;
				
			
			}while(number !=0);
			
			double average = (double)suma / counter;
			System.out.println("suma:" +suma);
			System.out.println("�rednia:" +average);
			System.out.println("najwi�ksza liczba:" +max);


			
			
			}
		}




