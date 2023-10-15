import java.util.Scanner;

class p4_1s21 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            
            String nombre;
            String edad;
            String correo;
            String telefono;

            System.out.println("ingresa tu nombre");
            nombre = teclado.nextLine();

            System.out.println("ingresa tu Edad");
            edad = teclado.nextLine();

            System.out.println("ingresa tu Correo");
            correo = teclado.nextLine();

            System.out.println("ingresa tu Telefono");
            telefono = teclado.nextLine();

            System.out.println("Bienvenido " + nombre + ", tu Edad es " + edad + " años, tu Correo es " + correo + " y tu Telefono es " + telefono + " :)");
        }
    }
}
