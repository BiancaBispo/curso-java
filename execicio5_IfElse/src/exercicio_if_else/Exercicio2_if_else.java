package exercicio_if_else;

import java.util.Scanner;

public class Exercicio2_if_else {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        //Encadeamento de estrutura condicional
        if(num1<num2 && num1<num3){
            System.out.println("MENOR = " + num1);
            
        }
        else if(num2<num3){
            System.out.println("MENOR = " + num2);
            
        } else{
            System.out.println("MENOR = " + num3);
            
        }
        
        sc.close();
    
    }
}
