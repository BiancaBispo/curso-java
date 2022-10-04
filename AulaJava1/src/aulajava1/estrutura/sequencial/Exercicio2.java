package aulajava1.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        
        double area ,perimetro, diagonal;
         
        area = base * altura;
        
        perimetro = 2.0*base + 2.0*altura;
        //OU, deixando o 2 em evidência
        //perimetro = 2.0 * (base + altura); 

        
        //diagonal = Math.pow(base, 2.0) + Math.pow(altura, 2.0);
        //diagonal = Math.sqrt(diagonal);
        
        //OU 
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
        
        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);
        
        sc.close();
        
    }
}
