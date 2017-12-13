import java.util.Scanner;

public class delta {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbê:");
		double numer = scanner.nextDouble();
		System.out.print("Podaj liczbê:");
		double numer1 = scanner.nextDouble();
		System.out.print("Podaj liczbê:");
		double numer2 = scanner.nextDouble();
		scanner.close();
		

		if(numer == 0 )
		{
			if(numer1==0) {
			
				if(numer2==0) 
				{
					System.out.print("nieskoñcznie wiele roziw¹zañ");
			    }
				else 
				{
					System.out.print("brak rozwi¹zañ");
				}
			}
			else 
			{
				System.out.print("x="+-numer1/numer2);
			}
			}
		else 
		{
			double delta = numer1*numer1-4*numer*numer2;
			
			if(delta<0)
			{
				System.out.print("brak rozwi¹zañ w ciele R");
			}
			if(delta>0)
			{
				double x1=(-numer1+Math.sqrt(delta))/2*numer;
				double x2=(-numer1-Math.sqrt(delta))/2*numer;
				System.out.println("x1="+x1);
				System.out.println("x2="+x2);

			}
			if(delta==0)
			{
				double x3=(-numer1/2*numer);
				System.out.println("x1="+x3);
				

			}
			
		}
		
		}
		
		
			
			
	
		
		
		
		
		
		
	}


