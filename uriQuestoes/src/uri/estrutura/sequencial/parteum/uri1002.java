package uri.estrutura.sequencial.parteum;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Bislu
 */
public class uri1002 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        double R, A, n;
        n = 3.14159;
        
        R = sc.nextDouble();
        
        A = n * Math.pow(R,2);
        
        System.out.printf("A=%.4f%n", A);
        
        sc.close();
        
    }
}
