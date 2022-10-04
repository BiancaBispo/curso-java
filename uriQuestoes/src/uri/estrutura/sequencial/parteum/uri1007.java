package uri.estrutura.sequencial.parteum;

import java.util.Locale;
import java.util.Scanner;

public class uri1007 {
    public static void main(String[] args){
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, D, diferenca;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        diferenca = (A*B - C*D);
        
        System.out.println("DIFERENCA = " + diferenca);
        
        sc.close();
    
    }
    
}
