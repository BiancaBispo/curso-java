package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri1036 {
//FORMULA DE BHASKARA
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double R1,R2;
        double delta;
        
        delta = (B*B) - 4.0 * A * C;
        
        if(A == 0 || delta < 0.0) {
            System.out.println("Impossivel calcular");
        } else{
            R1 = (- B + Math.sqrt(delta)) / (2.0 * A);

            R2 = (- B - Math.sqrt(delta)) / (2.0 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);

        }
        
        
        
        
        sc.close();
    }
}
