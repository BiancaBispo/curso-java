package uri;

import java.util.Scanner;

public class uri1038 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double precoTotal;
        
        /*if(codigo == 1) {
            precoTotal = quantidade * 4.00;
        } else if(codigo == 2) {
            precoTotal = quantidade * 4.50;
        } else if(codigo == 3) {
            precoTotal = quantidade * 5.00;
        } else if(codigo == 4) {
            precoTotal = quantidade * 2.00;
        } else {
            precoTotal = quantidade * 1.50;
        }*/
        
        
        switch(codigo){
            case 1:
                precoTotal = quantidade * 4.00;
                break;
            case 2:
                precoTotal = quantidade * 4.00;
                break;
        }
       // System.out.printf("Total: R$ %.2f%n", precoTotal);
        sc.close();
    }
}
