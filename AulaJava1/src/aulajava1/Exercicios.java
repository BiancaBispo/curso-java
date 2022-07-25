/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajava1;

/**
 *
 * @author Bislu
 */
public class Exercicios {
    
    public static void main(String[] args) {

        /*É PRIMO?!!*/
       int input1 = 216; //216
       int input2 = 5; //6

       if(input1 == 0 || input2 == 0) {
           //return 3;
           System.out.println(3);  
       } 
       else if(input1%input2 == 0) {
           //int multiplo = input1%input2)==0;
           //System.out.println(Math.abs(multiplo));  
           System.out.println(2);  
       }
       else {
           System.out.println(1);  
       }


       int input3 =  12;
       int input4 =  17;
       int input5 =  19;
       int input6 =  14;
       int input7 =  115;

       int count=0; 
        if(input3%2 == 0) {
           System.out.println(1);  

       }  
        else {
           System.out.println(2);  
       }
    
    }
}
