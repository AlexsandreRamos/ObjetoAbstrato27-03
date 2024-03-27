
package com.mycompany._aula;

import java.util.Scanner;

/**
 *
 * @author Alexsandre
 */
public class _Aula1 {
    String hora;
    boolean local;
    String cursando;
    
    void estado(){
     
        System.out.println("Você estuda no Senac");
        System.out.println("Está cursando: "+ this.cursando);
            System.out.println("Voce chega as "+ this.hora);
        
       
    
            
        
    }
    
    boolean localidade(){
        Scanner tecladoString = new Scanner(System.in);
        
        System.out.println("Você estuda do senac?");
        String resposta = tecladoString.nextLine().toLowerCase();
        
        if(resposta.equals("sim")){
            return true;
        }else if(resposta.equals("nao") || resposta.equals("não") ){
            
            return false;
            
        }
        System.out.println("resposta invalida tente novamente.");
        
       
        return localidade();
    }
    
    
   
    
}
