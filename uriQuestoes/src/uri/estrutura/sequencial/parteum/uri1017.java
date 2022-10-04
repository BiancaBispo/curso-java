package uri.estrutura.sequencial.parteum;

import java.util.Scanner;
import java.util.Locale;

public class uri1017 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int horas = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        
        double litros;
        
        litros = horas * velocidadeMedia;
        litros /= 12.0;
        
        System.out.printf("%.3f%n", litros);
        
        sc.close();
    
    }

    
}
