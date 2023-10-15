import java.util.Scanner;

class p3_1s21 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            String cadena; 
            System.out.println("ingresa tu nombre");
            cadena = teclado.nextLine();
            System.out.println("bienvenido " + cadena + ", a la clase");
        }
    }
}