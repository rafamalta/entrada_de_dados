import java.util.Scanner;

public class processamentoDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); //esse é o objeto
 		
		String x;
		int y;
		double a;
		char b;
		
		x = sc.next();
		y = sc.nextInt();
		a = sc.nextDouble();
		b = sc.next().charAt(0); // o número indica a POSIÇÃO da String
		
		System.out.println("Você digitou " + x);
		System.out.println("Você digitou " + y);
		System.out.println("Você digitou " + a);
		System.out.println("Você digitou " + b);
		
		sc.close(); //quando não precisar mais do objeto sc

	}

}
