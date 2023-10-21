import java.util.Scanner;
public class P2p7_1s21 {
    public static void main(String[] args) {
        
        char opc;
        Scanner teclado = new Scanner(System.in);
        boolean estado = true; 

        do {
            System.out.println("Ingresa un valor");
            System.out.println("1 para suma");
            System.out.println("2 para resta");
            System.out.println("3 para multiplicacion");
            System.out.println("4 para division");

            opc = teclado.next().charAt(0);

            switch (opc) {
                case '1': System.out.println("Realizaremos una suma");break;
                case '2': System.out.println("Realizaremos una resta");break;
                case '3': System.out.println("Realizaremos una multiplicacion");break;
                case '4': System.out.println("Realizaremos una division");break;
                case 's':
                case 'S': System.out.println("Has elegido la opcion de salir");
                estado = false;break;
                
                default: System.out.println("no existe esa opcion");
            }
        } while (estado);
    }
}
