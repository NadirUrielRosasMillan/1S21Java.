import java.util.Scanner;

public class EXAM9 {
    public static void main(String[] args) {
        try (Scanner o = new Scanner(System.in)) {
            double i,v,r;
            System.out.println("ingresa el valor de R");
            r = o.nextDouble();
            if (r < 0) {
                System.out.println("Error: no existen negativos :)");
            } else if (r==0) {
                System.out.println("Estas seguro que es CERO? :/");
            }else if (r>=1000) {
                System.out.println("Esta fuera de limites aceptables :/");
            } else {
                System.out.println("ingresa el valor de I");
                i = o.nextDouble();
                v = i * r;
                System.out.println("el voltaje es " + v);
            }
        }
    }
}
