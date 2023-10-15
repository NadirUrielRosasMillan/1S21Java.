import java.util.Scanner;

public class T3_1s21 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double l,j,p,r,v = 4,i= 3.1416,m=3;

        System.out.println("ingresa el radio de tu esfera");
        r = n.nextDouble();
        p = Math.pow(r, 3);
        j = p * v * i;
        l = j/m;

        System.out.println("el volumen de tu esfera es " + l);
    }
}
