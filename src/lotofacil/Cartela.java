/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotofacil;

import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Cartela {
    

    private ArrayList<Integer> numerosApostados;
    
    public Cartela(){
        numerosApostados =  new ArrayList<>();
    }

    public boolean isApostaConcluida() {   
        return numerosApostados.size() >= 15;
    }
    
    public boolean marcarNumero(int numero){
        
        if(numeroRepetido(numero) || isApostaConcluida() || numeroInvalido(numero)){
            return false;
        }
    
        return numerosApostados.add(numero);
        
    }

    private boolean numeroInvalido(int numero) {
        return numero < 1 || numero > 25;
    }

    private boolean numeroRepetido(int numero) {
        return numerosApostados.contains(numero);
    }
    
    
    
    
    
            
}
