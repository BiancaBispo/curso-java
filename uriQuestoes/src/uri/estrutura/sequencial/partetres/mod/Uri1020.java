package uri.estrutura.sequencial.partetres.mod;

import java.util.Scanner;

public class Uri1020 {
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        
        int ano, meses, dias, resto;
        
        //Primeiro, dividir a idade pela quantidade dos dias do ano. Tendo assim o ano do dado da entrada 'idade'
        ano = idade / 365;
        
        // Depois pegamos a idade novamente e applicamos o %  - MOD (achar o divisor comum - mod), com a quantidade de dias no ano para descobrir o que sobrou da idade 
        resto = idade % 365;
       
        // Depois aplicamos o resto dividido pelo quantidade de dias do mes para descobrir, os meses. 
        meses = resto / 30;
        
        // Para descobrir os dias, pegar o valor do resto e aplicar o resto pela quantidade de dias do mes
        dias = resto % 30 ;
        
         System.out.println(ano + " ano(s)");
         System.out.println(meses + " mes(es)");
         System.out.println(dias + " dia(s)");
        
        sc.close();
    }
}
