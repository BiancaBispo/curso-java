package uri.estrutura.sequencial.partedois;

import java.util.Scanner;
import java.util.Locale;

public class uri1011 {

    public static void main(String[] args){
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double raio = sc.nextDouble();
        double volume;
        double pi = 3.14159;
        
        volume = (4.0/3.0) * pi * (Math.pow(raio,3.0)) ;
        
        System.out.printf("VOLUME = %.3f%n", volume);
        
        sc.close();
    
    }    
}
