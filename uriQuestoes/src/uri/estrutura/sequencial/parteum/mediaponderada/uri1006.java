package uri.estrutura.sequencial.parteum.mediaponderada;

import java.util.Scanner;
import java.util.Locale;

public class uri1006 {
    public static void main(String[] args){
        //MEDIA PONDERADA
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double MEDIA = (A*2.0 + B*3.0 + C*5.0) / 10.0;
        
        System.out.printf("MEDIA = %.1f%n", MEDIA);
        
        
        sc.close();
        
    }
}
