import java.util.Scanner;

public class processamentoDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); //esse � o objeto
 		
		String x;
		int y;
		double a;
		char b;
		
		x = sc.next();
		y = sc.nextInt();
		a = sc.nextDouble();
		b = sc.next().charAt(0); // o n�mero indica a POSI��O da String
		
		System.out.println("Voc� digitou " + x);
		System.out.println("Voc� digitou " + y);
		System.out.println("Voc� digitou " + a);
		System.out.println("Voc� digitou " + b);
		
		sc.close(); //quando n�o precisar mais do objeto sc

	}

}
