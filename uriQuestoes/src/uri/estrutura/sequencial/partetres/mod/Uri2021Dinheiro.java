package uri.estrutura.sequencial.partetres.mod;

import java.util.Locale;
import java.util.Scanner;

public class Uri2021Dinheiro {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        double N = sc.nextDouble();
        
        int notas, moeda, resto, quociente;
        
        
        /* Como Realizar?
        
        Vamos multiplicar N por 100 e forçar a conversão para int.
        Desse modo, por exemplo, 576.73 vai se tornar 57673

        Vamos tambem somar 0.5 antes de converter, para assegurar 
        que o numero seja devidamente arredondado, pois o tipo double
        as vezes da problema de arredondamento (por exemplo: se digitarmos
        576.81 e multiplicarmos por 100, o resultado sera 57680.99999999,
        dai o casting resultaria em 57680 e nao 57681 como desejado)
        
        */
        
        //Conversão para deixar o numero arredondado corretamente
        resto = (int) (N * 100.0 + 0.5);
        
        
        /*Realizando a view e os calculos dos valores, com o valor do 'resto' feito acima*/
        System.out.println("NOTAS: ");
        
        /* Como multiplicamos o valor por 100, logo acima, o valor de cada nota também deverá ser multiplicado por 100 a seguir*/
        
        notas = 100; // Para notas de valor 100 
        quociente = resto / (notas * 100); // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100); // Pegando o valor que vai sobrar de não for da nota de 100
        
        notas = 50; // Para notas com valor 50
        quociente = resto / (notas * 100); // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100); // Pegando o valor que vai sobrar de não for da nota de 50
        
        notas = 20; // Para notas com valor 20
        quociente = resto / (notas * 100); // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100); // Pegando o valor que vai sobrar de não for da nota de 20
        
        notas = 10; // Para notas com valor 10
        quociente = resto / (notas * 100); // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100); // Pegando o valor que vai sobrar de não for da nota de 10
        
        notas = 5; // Para notas com valor 5
        quociente = resto / (notas * 100); // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100); // Pegando o valor que vai sobrar de não for da nota de 5
        
        notas = 2; // Para notas com valor 2
        quociente = resto / (notas * 100); // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100); // Pegando o valor que vai sobrar de não for da nota de 2
        
        
        // O valor de cada moeda deverá ser representado em centavos
        System.out.println("MOEDAS: ");
        
        moeda = 100; // Para moedas com valor 100 = 1 real
        quociente = resto / moeda; // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " moeda(s) de R$ 1.00");
        resto = resto % moeda; // Pegando o valor que vai sobrar de não for da nota de 2
        
        moeda = 50; // Para moedas com valor 50 = 0.50 centavos
        quociente = resto / moeda; // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " moeda(s) de R$ 0.50");
        resto = resto % moeda; // Pegando o valor que vai sobrar de não for da nota de 2
        
        moeda = 25; // Para moedas com valor 25 = 0.25 centavos
        quociente = resto / moeda; // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " moeda(s) de R$ 0.25");
        resto = resto % moeda; // Pegando o valor que vai sobrar de não for da nota de 2
        
        moeda = 10; // Para moedas com valor 10 = 0.10 centavos
        quociente = resto / moeda; // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " moeda(s) de R$ 0.10");
        resto = resto % moeda; // Pegando o valor que vai sobrar 
        
        moeda = 5; // Para moedas com valor 5 = 0.05 centavos
        quociente = resto / moeda; // descobrindo quantas notas serão nesse valor
        System.out.println(quociente + " moeda(s) de R$ 0.05");
        resto = resto % moeda; // Pegando o valor que vai sobrar 
        
       
        System.out.println( resto + " moeda(s) de R$ 0.01");
        
        sc.close();
    }
}
