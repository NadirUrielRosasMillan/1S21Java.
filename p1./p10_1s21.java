import java.util.Scanner;
public class p10_1s21 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String operacion;
        System.out.println("¿Que tipo de operacion desea realizar");
        System.out.println("Escribala: Suma, Resta, Multiplicacion o Division");

        operacion = teclado.nextLine();

        if (operacion.equals("Suma")) {
            System.out.println("Haremos una suma :)");
            Scanner sm = new Scanner(System.in);

            float s1;
            float s2;
            float s3;

            System.out.println("ponga el primer digito a que quiere sumar:");
            s1 = sm.nextFloat();
            System.out.println("ponga el segundo digito a que quiere sumar:");
            s2 = sm.nextFloat();

            s3 = s1 + s2;

        
            System.out.println("El resultado es: " + s3 );
        
        
        
        }else if (operacion.equals("Resta")){
        System.out.println("Haremos una resta :)");

        Scanner ra = new Scanner(System.in);

            float r1;
            float r2;
            float r3;

            System.out.println("ponga el primer digito a que quiere restar:");
            r1 = ra.nextFloat();
            System.out.println("ponga el segundo digito a que quiere restar:");
            r2 = ra.nextFloat();

            r3 = r1 - r2;

        
            System.out.println("El resultado es: " + r3 );
    
    
    
    
    
        }else if (operacion.equals("Multiplicacion")){
        System.out.println("Haremos una Multiplicacion :)");



        Scanner mn = new Scanner(System.in);

            float m1;
            float m2;
            float m3;

            System.out.println("ponga el primer digito a que quieres multiplicar:");
            m1 = mn.nextFloat();
            System.out.println("ponga el segundo digito a que quiere multiplicar:");
            m2 = mn.nextFloat();

            m3 = m1 * m2;

        
            System.out.println("El resultado es: " + m3 );




        
        }else if (operacion.equals("Division")){
        System.out.println("Haremos una Division :)");
        

        Scanner dn = new Scanner(System.in);

            float d1;
            float d2;
            float d3;

            System.out.println("ponga el dividiendo:");
            d1 = dn.nextFloat();
            System.out.println("ponga el divisor:");
            d2 = dn.nextFloat();

            d3 = d1 / d2;

        
            System.out.println("El resultado es: " + d3 );







        }else{
            System.out.println("No existe la operacion");
        }
    }
}

