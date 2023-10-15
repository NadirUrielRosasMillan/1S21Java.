import java.util.Scanner;

public class T2_1s21 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        double x,n,rad = 3.1416 /180;

        System.out.println("ingresa el angulo que quieres pasar a radianes");
        n = v.nextDouble();
        x = n*rad;
        System.out.println("el resultado en radianes es " + x);
    }
}
