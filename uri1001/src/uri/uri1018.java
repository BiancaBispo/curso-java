package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri1018 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double nota;
        
        nota = 100 % N;
        
        
        System.out.println(N);
        System.out.println( nota + " nota(s) de R$ " );
        
        sc.close();
    
    }
}
