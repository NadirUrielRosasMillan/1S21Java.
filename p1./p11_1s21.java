import java.util.Scanner;


public class p11_1s21{
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Escribe que operacion deseas relizar");
			System.out.println("Suma, Resta, Multiplicacion, Division, Raiz o Potencia");
			String opc = "Suma";
			opc = teclado.nextLine();
			switch(opc){

			case "Suma":
				System.out.println("haremos una suma");
				Scanner sm = new Scanner(System.in);

				float s1;
				float s2;
				float s3;

			System.out.println("Escribe el primer numero a sumar");
				s1 = sm.nextFloat();

			System.out.println("Escribe el segundo numero a sumar");
				s2 = sm.nextFloat();


				s3= s1 + s2;

			System.out.println("El resultado es " + s3);


				break;
			case "Resta":
				System.out.println("Haremos una resta");


				Scanner ra = new Scanner(System.in);

				float r1;
				float r2;
				float r3;

			System.out.println("Escribe el primer numero");
				r1 = ra.nextFloat();

			System.out.println("Escribe lo que quieres restarle");
				r2 = ra.nextFloat();


				r3= r1 - r2;

			System.out.println("El resultado es " + r3);
				break;
			case "Multiplicacion":
				System.out.println("Haremos una multiplicaion");

				Scanner mn = new Scanner(System.in);

				float m1;
				float m2;
				float m3;

			System.out.println("Escribe el primer numero");
				m1 = mn.nextFloat();

			System.out.println("Escribe por lo que lo quieres multiplicar");
				m2 = mn.nextFloat();


				m3= m1 * m2;

				System.out.println("El resultado es " + m3);

				break;
			case "Division":
				System.out.println("Haremos una division");

				Scanner dn = new Scanner(System.in);

				float d1;
				float d2;
				float d3;

			System.out.println("Escribe el dividiendo");
				d1 = dn.nextFloat();

			System.out.println("Escribe el divisor");
				d2 = dn.nextFloat();


				d3= d1 / d2;

				System.out.println("El resultado es " + d3);


				break;
			case "Raiz":
				System.out.println("Haremos una raiz");


				Scanner rz = new Scanner(System.in);

				double z1;
				double z2;


			System.out.println("Escribe el numero que quieras sacarle su raiz");
				z1 = rz.nextDouble();

				z2 = Math.sqrt(z1);

				System.out.println("El resultado es " + z2);


				break;


			case "Potencia":
				System.out.println("Haremos una potencia");	

				Scanner p = new Scanner(System.in);

				double p1;
				double p2;
				double p3;


			System.out.println("Escribe la base");
				p1 = p.nextDouble();

			System.out.println("Escribe el exponente");
				p2 = p.nextDouble();


				p3 = Math.pow(p1, p2);

				System.out.println("El resultado es " + p3);


				break;
			default:
				System.out.println("No se encuentra la opcion deseada");

			}
		}
	}

}