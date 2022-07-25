
package aulajava1;

import java.util.Locale;
/**
 *
 * @author Bianca
 */
public class ProcessamentoDados {
    public static void main(String[] args) {

        String nome = "Bianca";
        int idade = 22;
        double renda = 2000.00;

        /* 
        %f = ponto flutuante
        %d = inteiro
        %s = texto
        %n = quebra de linha 
        */

        System.out.printf(" %s tem %d anos e ganha R$ %.3f reais. %n%n", nome, idade, renda);
        
        
        //EXERCICIO FIXAÇÃO
       
        String product1 = "Computer";
        String product2 = "Office Desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;
        
        //Forma 1:
        System.out.printf(
                "Products: %n %s, which prince is $ %.2f %n"
                + "%s, which prince is $ %.2f %n%n "
                + "Record: %d years old, code %d and gender: %s"
                + "%n%n Measure witheight decimal places: %f %n "
                + "Rouded (three decimal places): %.3f %n " 
                , product1, prince1, product2, prince2, age, code, gender, measure, measure, measure);

                Locale.setDefault(Locale.US);
                System.out.printf("US decimal point: %.3f %n%n",measure);
        
        //Forma 2 - fazer em cada System Out separado 
        
        
        /*CASTING - é a conversão explicita de um tipo para outro. É necessario quando o compilador não é capaz 
        de "adivinhar" que o resultado de uma expressãodeve ser de outro tipo. */
        
        //Exemplo 1 - Atribuição casting
        int x,y;
        x=5;
        y=2*x;
        
        System.out.println("Iniciando Casting - Atribuição");
        System.out.println(x);
        System.out.println(y);
        
        //Exemplo 2 - Atribuição
        int a;
        double c; // resultado como double imprime por padrão o 00.0
        a=5;
        c=2*a;
        
        System.out.println("Iniciando Casting - Atribuição 2");
        System.out.println(a);
        System.out.println(c);
        
        //Exemplo 3 - Calcular area Double
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        
        area = (b+B) / 2.0 * h;
        System.out.println("A area é: " + area);
        
        //Exemplo 4 - Calcular area Float 
        
    }
}
