import java.util.Scanner;

public class P3P4_1S21{
	static Scanner teclado = new Scanner(System.in);
		static int n;

	public static void elevacion (int a, int contador){


		
		

		if(!(contador == n)) elevacion(a*2,contador+1);
		else System.out.println("el valor es " + a);

		}
	

	public static void main(String[] args){
		int valor = 2;
		

		System.out.println("ingresa hasta que numero quieres que pare");
		n= teclado.nextInt();


		elevacion(valor,1);
	}
}