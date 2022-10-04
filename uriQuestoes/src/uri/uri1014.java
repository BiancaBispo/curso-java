package uri;

/*
Calcule o consumo médio de um automóvel sendo fornecidos a 
distância total percorrida (em Km) e o total de combustível gasto (em litros).
*/
import java.util.Scanner;
import java.util.Locale;

public class uri1014 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        double Y = sc.nextDouble();
        double total;
        
        total = X / Y;
        
        System.out.printf("%.3f km/l%n", total);
        
        sc.close();
    }
}
