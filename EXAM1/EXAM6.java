import java.util.Scanner;
import java.lang.Math;
public class examen_6{
	public static void main(String[] args) {
		try (java.util.Scanner teclado = new Scanner(System.in)) {
			int x, c, y, a, b;
			double n;
			int resultado;
			double r;
			System.out.println("calcular el valor de las distancia entre 2 puntos ");
			System.out.println("introduce las cordenadas del punto X: ");
			x = teclado.nextInt();
			System.out.println("introduce las cordenadas del punto Y: ");
			y = teclado.nextInt();
			System.out.println("introduce el valor A: ");
			a = teclado.nextInt();
			System.out.println("introduce el valor B: ");
			b = teclado.nextInt();
			System.out.println("introduce el valor de C: ");
			c = teclado.nextInt();
			resultado = Math.abs((a*x) + (b*y) + c);
			r = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
			n = resultado/r;
			System.out.println("la distancia es: " + n);
		}
	}
}