public class P2p11_1s21 {
    public static void main(String[] args) {
        for (String cadena : args){
        char argumento = cadena.charAt(1);
        switch(argumento){
            case 'a' : System.out.println("inciso a");break;
            case 'b' : System.out.println("inciso b");break;
            case 'h' : System.out.println("inciso h");break;
            case 'e' : System.out.println("inciso e");break;
        }
        }
    }
}
