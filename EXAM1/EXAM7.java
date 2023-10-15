import java.util.Scanner;

public class EXAM7 {
    public static void main(String[] args) {
        try (Scanner t = new Scanner(System.in)) {
            double a,b,c,d,e,f,y,x;

            System.out.println("ingresa tu primera ecuacion");
            System.out.println("ingresa el primer valor de x");
            a = t.nextDouble();

            System.out.println("ingresa el primer valor de y");
            b = t.nextDouble();

            System.out.println("ingresa el primer valor de c");
            c = t.nextDouble();


            System.out.println("ingresaras los valores de tu segunda ecuacion");
            System.out.println("ingresa el primer valor de x");
            d = t.nextDouble();

            System.out.println("ingresa el primer valor de y");
            e = t.nextDouble();

            System.out.println("ingresa el primer valor de c");
            f = t.nextDouble();
            
            y = ((a*f)-(c*d))/((a*e)-(b*d));
            x = ((c*e)-(b*f))/((a*e)-(b*d));
            if ((a*e)-(b*d) == 0) {
                System.out.println("no hay solucion ):");}
                else {System.out.println("el valor de x es " + x);
            }
            if ((a*e)-(b*d) == 0) {
                System.out.println("no hay solucion );");
            } else {
                System.out.println("el valor de y es " + y);
            }
            
            
        }


    }    
}
