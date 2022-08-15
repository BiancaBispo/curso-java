package aulajava1;

import java.util.Scanner;


/* Estrutura Switch-Case
Quando se tem várias opções de fluxo a serem tratadas com base no
valor de uma variável, ao invés de várias estruturas if-else encadeadas,
alguns preferem utilizar a estrutura switch-case.
*/
public class SintaxeOpcional_switch_case {
    public static void main(String[] args){
        
        /*Problema exemplo -
        Fazer um programa para ler um valor inteiro de 1 a 7 representando um
        dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
        Escrever na tela o dia da semana correspondente, conforme exemplos. 
        */
        
        Scanner sc = new Scanner(System.in);
        
        int dia = sc.nextInt();
        String semana;
        
         switch(dia){
            case 1:
                semana = "domingo";
                break;
            case 2:
                semana = "segunda";
                break;
            case 3:
                semana = "terça";
                break;
            case 4:
                semana = "quarta";
                break;
            case 5:
                semana = "quinta";
                break;
            case 6:
                semana = "sexta";
                break;
            case 7:
                semana = "sabado";
                break;
            default:
                semana = "valor invalido";
                break;
        }
         
        System.out.println("Dia da Semana: " + semana);

        /*OUUU
        
        
        switch(dia){
            case 1:
                System.out.println("Dia da Semana: domingo");
                break;
            case 2:
                System.out.println("Dia da Semana: segunda");
                break;
            case 3:
                System.out.println("Dia da Semana: terça");
                break;
            case 4:
                System.out.println("Dia da Semana: quarta");
                break;
            case 5:
                System.out.println("Dia da Semana: quinta");
                break;
            case 6:
                System.out.println("Dia da Semana: sexta");
                break;
            case 7:
                System.out.println("Dia da Semana: sabado");
                break;
        }
        */
        
        
        sc.close();
    }
}
