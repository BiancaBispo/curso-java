package uri.estrutura.sequencial.partetres.mod;

import java.util.Scanner;
import java.util.Locale;

public class Uri1018 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int nota, quosiente, resto;
        
        /*Realizando a view e os calculos dos valores*/

        // Mostrar o valor total
        System.out.println(N);

        resto = N * 100 + 5;

                
        // Valor da nota desejada = 100
        nota = 100;
        // Calculo para descobrir quantas notas serão utilizadas de acordo com o valor de N
        quosiente = resto / (nota * 100);
        
        // Mostrar
        System.out.println(quosiente + " nota(s) de R$ " + nota + ",00");
        
        // Se sobrar, vamos usar o resultado do 'resto' para as outras notas
        resto = resto % (nota * 100);
        
        
        // Valor da nota desejada = 50
        nota = 50;
        // Calculo para descobrir quantas notas serão utilizadas de acordo com o valor de N
        quosiente = resto / (nota * 100);
        // Mostrar
        System.out.println(quosiente + " nota(s) de R$ " + nota + ",00");
        // Se sobrar, vamos usar o resultado do 'resto' para as outras notas
        resto = resto % (nota * 100);
        
        // Valor da nota desejada = 20
        nota = 20;
        // Calculo para descobrir quantas notas serão utilizadas de acordo com o valor de N
        quosiente = resto / (nota * 100);
        // Mostrar
        System.out.println(quosiente + " nota(s) de R$ " + nota + ",00");
        // Se sobrar, vamos usar o resultado do 'resto' para as outras notas
        resto = resto % (nota * 100);
        
        // Valor da nota desejada = 10
        nota = 10;
        // Calculo para descobrir quantas notas serão utilizadas de acordo com o valor de N
        quosiente = resto / (nota * 100);
        // Mostrar
        System.out.println(quosiente + " nota(s) de R$ " + nota + ",00");
        // Se sobrar, vamos usar o resultado do 'resto' para as outras notas
        resto = resto % (nota * 100);
        
        
        // Valor da nota desejada = 5
        nota = 5;
        // Calculo para descobrir quantas notas serão utilizadas de acordo com o valor de N
        quosiente = resto / (nota * 100);
        // Mostrar
        System.out.println(quosiente + " nota(s) de R$ " + nota + ",00");
        // Se sobrar, vamos usar o resultado do 'resto' para as outras notas
        resto = resto % (nota * 100);
        
        // Valor da nota desejada = 2
        nota = 2;
        // Calculo para descobrir quantas notas serão utilizadas de acordo com o valor de N
        quosiente = resto / (nota * 100);
        // Mostrar
        System.out.println(quosiente + " nota(s) de R$ " + nota + ",00");
        // Se sobrar, vamos usar o resultado do 'resto' para as outras notas
        resto = resto % (nota * 100);
        
        // Valor da nota desejada = 1
        nota = 1;
        // Calculo para descobrir quantas notas serão utilizadas de acordo com o valor de N
        quosiente = resto / (nota * 100);
        // Mostrar
        System.out.println(quosiente + " nota(s) de R$ " + nota + ",00");
        // Se sobrar, vamos usar o resultado do 'resto' para as outras notas
        resto = resto % (nota * 100);
        
        
        sc.close();
    
    }
}
