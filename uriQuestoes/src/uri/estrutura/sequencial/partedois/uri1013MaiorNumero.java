package uri.estrutura.sequencial.partedois;

import java.util.Scanner;

public class uri1013MaiorNumero {
    public static void main(String[] args){
        
        /*MAIOR numero com formula matematica - pode ser com 3 ou 2 numeros*/
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int maiorAux, maior ;
        
        maiorAux = (num1 + num2 + (Math.abs(num1 - num2))) / 2;
        
        maior = (maiorAux + num3 + (Math.abs(maiorAux - num3))) / 2;
                
        System.out.println(maior + " eh o maior");
        sc.close();
    }
}
