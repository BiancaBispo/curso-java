package uri;

import java.util.Scanner;

public class uri1035 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int soma1, soma2;
        
        //soma1 = C + D;
        //soma2 = A + B;
        
        if (B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0) {       
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }
        
        
        /*
        if(B>C && D>A){
            if(soma1> soma2)  {
                if(C > 0 && D > 0){
                    if(A%2 == 0){
                        System.out.println("Valores aceitos");
                    }   
                }
            } 
        } else{
            System.out.println("Valores não aceitos");
        }
        */
        
        sc.close();
    }
}
