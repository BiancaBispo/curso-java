package exercicio_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_if_else {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        
        double soma;
        
        soma = nota1 + nota2;
        
        System.out.printf("NOTA FINAL = %.1f%n", soma);

        if(soma < 60.0){
            System.out.println("REPROVADO");
        } 
        
        
        sc.close();
    }
    
}
