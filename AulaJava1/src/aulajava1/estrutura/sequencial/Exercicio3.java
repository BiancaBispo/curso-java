package aulajava1.estrutura.sequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args){
        //MEDIA IDADE
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome1 = sc.next();
        int idade1 = sc.nextInt();

        String nome2 = sc.next();
        int idade2 = sc.nextInt();
        
        double media = (idade1 + idade2) / 2.0;

        //OU        
        //double media = (double)(idade1 + idade2) / 2;
        
        System.out.printf("A idade média de %s e %s é de %.1f%n", nome1, nome2, media);
        
        sc.close();
    }
}
