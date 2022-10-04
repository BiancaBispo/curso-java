package uri.estrutura.sequencial.parteum;

import java.util.Scanner;
import java.util.Locale;

public class uri1010 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codigo = sc.nextInt();
        int numPeca = sc.nextInt();
        double valorUnitaPeca = sc.nextDouble();
        
        int codigo2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double valorUnitaPeca2 = sc.nextDouble();
        
        double result;
        
        result = (numPeca * valorUnitaPeca) + (numPeca2 * valorUnitaPeca2);
                
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", result);
        
        sc.close();
    }
}
