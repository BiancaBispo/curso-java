
package aulajava1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Bianca
 */
public class EntradaDados {
    public static void main(String[] args) {
        //ENTRADA DE DADOS - Ler info dos usuarios
        
        /*
        Scanner sc = new Scanner(System.in);  //Abrindo a entrada de dados

        String x;
        
        x = sc.next(); //Permitir que digite uma palavra, e é armazenado o valor em x
        
        //E depois mostrando o dados que o usuario me enviou-escreveu
        System.out.println("Você digitou: " + x);
        
        //Fechando o Scanner (a entrada de dados) - quando não for mais necessário.
        sc.close();
        
        */
        
        //Para deixar o valor com o ponto, usa-se o Locale antes do Scanner:
        Locale.setDefault(Locale.US);
        
        Scanner scr = new Scanner(System.in);  //Abrindo a entrada de dados

        /*Com tipo INT*/
        int y;
        
        y = scr.nextInt(); // Permite que digite um número e a armazene em X
        System.out.println("Você digitou numero: " + y);
        
        //Com o tipo Double
        double v;
        
        //No caso do double, se o computador estiver em BR vai ficar com virgula, se tiver como EUA vai ser ponto.
        v = scr.nextDouble();
        
        System.out.println("Você digitou:" + v);
        //OU
        //System.out.printf("Você digitou: %.2f" + v);

        
        /*Com vários tipos*/
        
        String j;
        int bb;
        double zz;
        
        j = scr.next();
        bb = scr.nextInt();
        zz = scr.nextDouble();
        
        System.out.println("Você digitou:" );
        System.out.println(j);
        System.out.println(bb);
        System.out.println(zz);

        
        /*COM QUEBRA DE LINHAS*/
        int l;
        String s1,s2,s3;
        
        //Mas se for colocar um valor int, não vai permitir colocar mais um valor ao ler, pois conta como um dos tres nextLine.
        l = scr.nextInt();
        scr.nextLine();
        
        //Para ler um monte dados/textos, mas só quando apertar o ENTER que ele vai ler o dado.
        s1 = scr.nextLine();
        s2 = scr.nextLine();
        s3 = scr.nextLine(); 
        
        System.out.println("Você digitou essa sequência:" );
        System.out.println(l);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        
        scr.close();
    }
}
