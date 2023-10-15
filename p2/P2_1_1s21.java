public class P2_1_1s21 {
    public static void main(String[] args) {
        System.out.println("Los primeros 10 numeros primos:)");
        int p,a;
        for ( p = 2; p <= 30; p++) {
            boolean si = true;
            for ( a = 2; a < p; a++) {
                if (p % a == 0) {
                    si = false;
                    break;
                }
            }
            if (si) {
                System.out.println(p);
            }
        }
    }
}