
package aulajava1;


//importanto a classe para tranformar virgula em ponto
import java.util.Locale;

//import java.util.Scanner;


/**
 *
 * @author Bislu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
        //Para colocar o ponto em vez da virgula, usa-se essa classe importada.
        Locale.setDefault(Locale.US);
        System.out.printf("Com ponto: %.4f%n", z);
        System.out.println("RESULTADO = " + z + " METROS");        

        //Concatenar varios elementos com printf
        System.out.printf("Resultado = %.1f metros%n", z);
        
       
       
       
      /* Scanner ler = new Scanner(System.in);
        String numero;
        
        System.out.print("Digite um numero: ");
        numero = ler.next();
        
        if(numero == 0) {
            return 2;
        }else {
            return 3;
        }
        
        System.out.println("O numero é " + numero);

        int idade = 20;  
      //checando a idade  
         if(idade%2 == 0) {  
             return 2;     
        }  
         else {
            return 1;
         }
       
        */
      
       
        
        
        

        

    }
    
}
