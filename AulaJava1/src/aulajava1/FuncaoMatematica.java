
package aulajava1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bianca
 */
public class FuncaoMatematica {
    public static void main(String[] args) {
        /*
        A = Math.sqrt(x);   - Váriavel A recebe a raiz quadrada de x
        A = Math.pow(x,y);  - Váriavel A recebe o resultado de x elevado a y
        A = Math.abs(x);    - Váriavel A receve a raiz absoluto de x (sem o valor negativo, retorna positivo)
        */
        
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;
        
        //Raiz Quadrada
        A = Math.sqrt(x); 
        B = Math.sqrt(y); 
        C = Math.sqrt(25.0);
        
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        
        //Elevado
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        
        //Positivo
        A = Math.abs(y);
        B = Math.abs(z);
        
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
        
        
        //  EXEMPLO DE EXPRESSÕES MAIORES, EX EXPRESSÃO DELTA É:
        double delta, a,b,c,x1,x2;
        a=3.0;
        b=29.0;
        c=10.0;
        
        delta = Math.pow(b,2.0) - 4*a*c;
      
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        
        System.out.println("Valor de delta = " + delta);
        System.out.println("Valor de x1 = " + x1);
        System.out.println("Valor de x2 = " + x2);
        
        
        
        //EXERCICIO
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Declarar e já colocar para Scanner
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();
        
        //Declara separadamente
        double area;
        
        area = largura * comprimento;
        
        //Declarar a váriavel e já atribui o valor
        double preco = area * metroQuadrado;
        
        System.out.println("AREA = %.2f%n" + area);
        System.out.println("PRECO = %.2f%n" + preco);

        sc.close();

        

        
        
    }
}
