package uri.estrutura.sequencial.parteum;

import java.util.Scanner;

public class uri1004 {
    public static void main(String[] args){
        
        //Multiplicação 
        Scanner sc = new Scanner(System.in);
        
        int num, num2, PROD;
        
        num = sc.nextInt();
        num2 = sc.nextInt();
        
        PROD = num * num2;
        
        System.out.println("PROD = " + PROD);
        
        sc.close();
        
    }
    
}
