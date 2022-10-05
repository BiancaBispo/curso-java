package uri.estrutura.sequencial.partetres.mod;

import java.util.Scanner;

public class Uri1061 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // Variavel que permite escrever texto no meio das variveis principais
        String s;
        
        // Entrada primeiro dia
        System.out.print("Dia " );
        int entradaDia = sc.nextInt();
        
        // Entrada da hora do evento - 
        int hh = sc.nextInt();
        
        s = sc.next(); // permite colocar o : 
        //System.out.print(" : ");

        int mm = sc.nextInt();
        
        //System.out.print(" : ");
        s = sc.next();// permite colocar o : 

        int ss = sc.nextInt();
        
        
        // Entrada do termino envento
        System.out.print("Dia ");
        int saidaDia = sc.nextInt();
        
        // Entrada - Da hora do termino do evento
        int hhTer = sc.nextInt();
        
        //System.out.print(" : ");
        s = sc.next();// permite colocar o : 

        int mmTer = sc.nextInt();
        
        //System.out.print(" : ");
        s = sc.next();// permite colocar o : 

        int ssTer = sc.nextInt();
        
        // Variaveis suporte
        int dia, hora, min, seg, inicio, fim, duracao, resto;
        
        inicio = (entradaDia * 24 * 60 * 60) + (hh * 60 * 60) + (mm * 60) + ss; // Pegando o dia, a hora, minuto e segundos do primeiro dia
        
        fim = (saidaDia * 24 * 60 * 60) + (hhTer * 60 * 60) + (mmTer * 60) + ssTer;
        
        duracao = fim - inicio; // Pegar o tempo de duração do evento
        
        // Descobrir o dia
        dia = duracao / (24 * 60 * 60);
        
        // Descobrir o valor que vai sobrar para as horas com base nos dias
        resto = duracao % (24 * 60 * 60); 
        
        // Descobrir as horas
        hora = resto / (60 * 60);
        
        // Descobrir o valor que vai sobrar para as minutos com base nas horas
        resto = duracao % (60 * 60); 
        
        // Descobrir os minutos
        min = resto / 60;
        
        // Descobrir os segundos
        seg = resto % 60;
        
        // Saida com os resultados
        System.out.println(dia + " dia(s)");
        System.out.println(hora + " hora(s)");
        System.out.println(min + " minuto(s)");
        System.out.println(seg + " segundo(s)");
        
        
        sc.close();
    }
}
