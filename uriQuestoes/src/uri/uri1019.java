package uri;

import java.util.Scanner;

public class uri1019 {
    public static void main(String[] args){
        //Conversão segundos em formato de horas:min:seg
        
        //1 min = 60 segundos
        //1 hora = 60 minutos = 3600 segundos
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //valor em segundo
        int tempo,restoHoras, horas, minutos, segundos;
        
        //Saber a hora:
        horas = N / 3600;
        restoHoras = N % 3600; //Para descobrir o RESTO da DIVISÃO 
        
        //Minutos
        minutos = restoHoras / 60;
        
        //Segundos
        segundos = restoHoras % 60; //Pegando o resto dos minutos e dividindo para saber os segundos
                
        //System.out.printf("%d:%d:%d " , horas, minutos, segundos);
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        
        sc.close();
    }
}
