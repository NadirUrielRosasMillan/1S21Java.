import java.util.Scanner;

public class T5_1s21 {
 public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    double h,s,a,b,c;
    System.out.println("ingresa el valor del lado a");
    a = l.nextDouble();
    System.out.println("ingresa el valor del lado b");
    b = l.nextDouble();
    System.out.println("ingresa el valor del lado c");
    c = l.nextDouble();
    

    s= a/2 + b/2 + c/2;
    h = Math.sqrt(s * (s-a)*(s-b)*(s-c));
    System.out.println(h); 
 }   
}
