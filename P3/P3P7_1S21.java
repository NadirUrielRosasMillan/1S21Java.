import java.util.Scanner;
public class P3P7_1S21 {

    public static int alcubo(int i){
        int ac =1;
        for(int c=0; c<3; c++){
            ac*=i;
        }
        return ac;
    }

    public static int factorial(int i){
        int fa=1;
        for(int f=i; f>0; f--){
            fa*=f;
        }
        return fa;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acomulador =0;
        System.out.println("Ingresa el valor de n: ");
        int n =teclado.nextInt();
            acomulador+=(alcubo(n)/factorial(n));
        
        System.out.println("El resultado de la sumatoria es: " + acomulador);
    }
}
