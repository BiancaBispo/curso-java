package uri.estrutura.sequencial.partedois;

import java.util.Scanner;
import java.util.Locale;

public class uri1009 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome = sc.next();
        double salarioFixo = sc.nextDouble();
        double TotalVendas = sc.nextDouble();
        
        double SalarioMes;
        
        SalarioMes = salarioFixo + (TotalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", SalarioMes);
        
        sc.close();
    }
}
