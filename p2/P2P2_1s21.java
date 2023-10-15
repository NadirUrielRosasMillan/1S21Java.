public class P2P2_1s21{

	public static void main(String[] args) {
		int val=6;

		switch(val){
		case 1: System.out.println("se evaluara a 1");
		case 2: System.out.println("se evaluara a 2");
		case 3: System.out.println("se evaluara a 3");	
		case 4: System.out.println("se evaluara a 4");
		case 5: System.out.println("se evaluara a 5");
		default: System.out.println("fuera del rango");
		}

		Character opc='b';

		switch(opc){
		case 'a': System.out.println("se evaluara A");
		case 'b': System.out.println("se evaluara B");
		case 'c': System.out.println("se evaluara C");
		case 'd': System.out.println("se evaluara D");
		case 'e': System.out.println("se evaluara E");
		case 'f': System.out.println("se evaluara F");
		default: System.out.println("no existe");	
		}
		
		String cadena= "tres";
		switch(cadena){
			case "uno": System.out.println("uno");
			case "dos": System.out.println("dos");
			case "tres": System.out.println("tres");
			case "cuatro": System.out.println("cuatro");
			default: System.out.println("no existe la opcion");
		}

	}
}