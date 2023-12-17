import java.util.Scanner;
public class P3P8_1S21 {
    
    public static void main(String[] args) {
    Scanner teclado =new Scanner(System.in);
    System.out.println("hasta que valor quieres la sucecion :)?");
    int t= teclado.nextInt();
        for (int i = 0; i < t; i++) {
        System.out.println(fibonacci(i));
    }
    }

    public static int fibonacci(int numero){
        if(numero==0){
            return 0;
        }else if(numero==1){
            return 1;
        }return fibonacci(numero-1)+fibonacci(numero-2);
    }
}
