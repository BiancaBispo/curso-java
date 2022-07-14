/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajava1;

/**
 *
 * @author Bislu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int y = 32 + 5 ;
        int x = 50;
        double a = 32/30;
        double z = 35.504356;


        
        System.out.print("Sem quebra de linha");
        System.out.println("Olá mundo!!");
        
        System.out.println(y);
        System.out.println("Valor sem soma, inteiro: " + x);        
        System.out.println("Valor dividido, double, quebrado: " + a);        
        
        System.out.print("Quebrado, ilustrando a quantidade de numeros que quer depois do ponto: ");
        //printf é´para falar que vai imprimir o valor formatado da variavel z.
        System.out.printf("%.2f%n", z);
        System.out.printf("%.4f%n", z);


    }
    
}
