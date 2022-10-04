package uri.estrutura.sequencial.partedois;

import java.util.Scanner;
import java.util.Locale;

public class uri1012 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159 ;
        
        triangulo = (A * C) / 2;
        
        circulo = pi * (Math.pow(C,2.0));
        
        //trapezio = ((A + B) * C) / 2;
         trapezio = (A + B) / 2.0 * C;
                
        quadrado = Math.pow(B,2.0);
        
        retangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f \n", triangulo);
        System.out.printf("CIRCULO: %.3f \n", circulo);
        System.out.printf("TRAPEZIO: %.3f \n", trapezio);
        System.out.printf("QUADRADO: %.3f \n", quadrado);
        System.out.printf("RETANGULO: %.3f \n", retangulo);

        
        sc.close();
    }
}
