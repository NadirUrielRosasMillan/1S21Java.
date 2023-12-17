import java.util.Scanner;
public class P3P11_1S21 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int n;
        System.out.println("ingresa el valor para mostarte el triangulo de pascal");
        n = teclado.nextInt();
        System.out.println("_________________________________");
        System.out.println("el valor es:");
        for (int i = 0; i <= n; i++) {
            System.out.print(" " + division(n,i)+ " ");
        }
        System.out.println(" ");
        System.out.println("_________________________________");
    }

    public static int division (int n, int i){
        int d=0;
        d+=(factorial(n)/multiplicacion(n,i));
        return d;
    }

    public static int factorial (int f){
        int resultado =1;
        for (int i = f; i > 0; i--) {
            resultado*=i;
        }return resultado;
    }

    public static int multiplicacion(int n, int k){
            int mult=0;
            mult+= ((factorial(k))*(factorial(n-k)));
            return mult;
}
}
