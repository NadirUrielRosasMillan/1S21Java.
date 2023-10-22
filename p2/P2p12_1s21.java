public class P2p12_1s21 {
    public static void main(String[] args) {
        char argumento;
        argumento = args[0].charAt(1);

        if(argumento == 'a'){
            System.out.println("inciso a");
        }
        else if (argumento == 'b' ){
            System.out.println("inciso b");
        } 
        else if (argumento == 'h') {
            System.out.println("incisio h");
        } 
        else if (argumento == 'e') {
            System.out.println("inciso e ");
        } else {
            System.out.println("No existe el valor");
        }
}
}
