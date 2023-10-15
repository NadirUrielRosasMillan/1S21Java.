import java.util.Scanner;

public class T4_1s21 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double l,d,c,r,p=3.1416;
        System.out.println("ingresa el valor de tu radio");
        r = n.nextDouble();
        c = Math.pow(r, 2);
        d = c * p;
        System.out.println("el area de tu circulo es " + d);



        l=2*p*r;
        System.out.println("la longitud de tu circunfencia es " + l);


    }    
}
