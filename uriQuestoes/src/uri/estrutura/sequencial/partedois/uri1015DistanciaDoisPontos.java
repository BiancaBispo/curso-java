package uri.estrutura.sequencial.partedois;

import java.util.Scanner;
import java.util.Locale;


public class uri1015DistanciaDoisPontos {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Linha 1
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        // Linha 2
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        //double distancia, distanAux, x,y;
        double distancia;
        
        
       /* x = x2 - x1;
        y = y2 - y1;
        
        distanAux = Math.pow(x,2) + Math.pow(y,2);
                
        distancia = Math.sqrt(distanAux);*/
        
        distancia = Math.sqrt(Math.pow((x2-x1),2.0) + Math.pow((y2-y1),2.0));
        
        System.out.printf("%.4f",distancia);
        sc.close();
    }
}
