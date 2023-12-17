import java.util.Scanner;

public class P3P10_1S21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n;
		System.out.println("Ingresa que valor quieres para n e i");
		n= teclado.nextInt();
		
		System.out.println("el valor es " + suma(n));
	}
		
	public static int alcubo(int n){
		int c=1;
		for (int j=0; j<3; j++){
			c*=n;
		}return c;
	}

	public static int factorial (int f){
		int p=1;
		for (int n=f;n>0;n--){
			p*=n;
		}
		return p;
	}

	public static int suma (int s){
		int acomulador =0;
		
		acomulador+=(mult(s)/factorial(s));
	return acomulador;
}
	public static int mult(int q){
		int acumulador = 0;
		for (int i = 0; i <= q; i++) {
			acumulador+=alcubo(q)*factorial(i);
		}
		return acumulador;
	}

}