

package com.mycompany._aula;

import java.util.Scanner;

/**
 *
 * @author Alexsandre
 */
public class _Aula {

    public static void main(String[] args) {
        
        Scanner tecladoString = new Scanner(System.in); 
        Scanner tecladoDouble = new Scanner(System.in);
        
         _Aula1 c1 = new _Aula1();
        
         
         
         
         
         
         boolean local = c1.localidade();
         c1.local = local;
         
         if(local == true){
         System.out.println("O que você está cursando?");
         c1.cursando = tecladoString.nextLine();
         
         System.out.println("Que hora você costuma chegar no senac?");
         c1.hora = tecladoString.nextLine();
         
         c1.estado();
         } else if(local == false){
             System.out.println("Pois comece a estudar no senac");
             
         }
        
    }
}
