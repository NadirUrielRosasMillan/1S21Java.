import java.util.Scanner;
public class p13_1s21 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        double n,x,i;

        int a,fac;
        a=0;
        System.out.println("Ingresa el valor de n");
        n = m.nextDouble();
        for(i=0; i<=n; i++){
            fac = 1;
            if (i==0) fac=1;
            else{
                for(x=i; x>0; x--){
                    fac*=x;
                }
            }
            a+= Math.pow(i, 3)/fac;
        System.out.println("El resultado es" + a); 
        }
        
    }
    
}

    

