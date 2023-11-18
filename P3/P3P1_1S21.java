import java.util.Scanner;
public class P3P1_1S21{
    static Scanner teclado = new Scanner(System.in);

    public static void suma(){
        System.out.println("Suma de dos numeros");

        System.out.println("Ingresa el primer numero");
        int a = teclado.nextInt();

        System.out.println("Ingresa el segundo valor");
        int b = teclado.nextInt();

        int c = a + b;

        System.out.println("El resultado de la suma es: " + c);
    }

    public static void resta(){
        System.out.println("Resta de dos numeros");

        System.out.println("Ingresa el primer numero");
        int a = teclado.nextInt();

        System.out.println("Ingresa el segundo valor");
        int b = teclado.nextInt();

        int c = a - b;

        System.out.println("El resultado de la resta es: " + c);
    }

    public static void multiplicacion(){
        System.out.println("Multiplicacion de dos numeros");

        System.out.println("Ingresa el primer numero");
        int a = teclado.nextInt();

        System.out.println("Ingresa el segundo valor");
        int b = teclado.nextInt();

        int c = a * b;

        System.out.println("El resultado de la multiplicacion es: " + c);
    }

    public static void division(){
        System.out.println("Division de dos numeros");

        System.out.println("Ingresa el primer numero");
        int a = teclado.nextInt();

        System.out.println("Ingresa el segundo valor");
        int b = teclado.nextInt();

        int c = a / b;

        System.out.println("El resultado de la division es: " + c);
    }

    public static void menu(){
        
        System.out.println("Operaciones Basicas");

        System.out.println("\n A) Suma");
        
        System.out.println("\n B) Resta");

        System.out.println("\n C) Multiplicacion");

        System.out.println("\n D) Division");

        System.out.println("\n ¿que operacion deseas?");
    }

    public static void main(String[] args) {
        menu();

        String opc = teclado.nextLine();

        if (opc.equals("A")) suma();
        if (opc.equals("B")) resta();
        if (opc.equals("C")) multiplicacion();
        if (opc.equals("D")) division();

        if (opc.equals("a")) suma();
        if (opc.equals("b")) resta();
        if (opc.equals("c")) multiplicacion();
        if (opc.equals("d")) division();

    }
}