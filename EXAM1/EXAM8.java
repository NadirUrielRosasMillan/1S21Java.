import java.util.Scanner;

public class EXAM8 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n;

        System.out.println("ingresa numero del 1-9 el cual deseas saber su tabla de multiplicar");
        n = r.nextInt();

        if (n <= 0) {
            System.out.println("tu numero no esta dentro del rango permitido");
        }else if (n > 9) {
            System.out.println("tu numero no esta dentro del rango permitido");
            
        }else{
            System.out.println("Tabla del " + n);
            for (int i=1; i<=10; i++) {
                int m;
                m = n * i;
                
                System.out.println(n + "*" + i + "=" + m);
            }
        }
    }   
}
