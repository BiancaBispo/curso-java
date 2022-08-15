package exercicio_if_else;

import java.util.Scanner;
import java.util.Locale;

/* OPERADORES DE ATRIBUIÇÃO CUMULATIVA
a += b;     a = a + b;
a -= b;     a = a - b;
a *= b;     a = a * b;
a /= b;     a = a / b;
a %= b;     a = a % b;

*/
public class SintaxeOpcional {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int consumiu = sc.nextInt();
        
        double plano = 50.0;
        
        if(consumiu > 100){
            //plano = plano + (consumiu - 100) * 2.0; 
            plano+= (consumiu - 100) * 2.0; // pegando o resto do valor acima de 100, para fazer o calculo.
        }
        
        System.out.printf("Valor a pagar: R$ %.2f%n", plano);

        
        sc.close();
    
    }

    
}
