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
    
    public void marcarNumero(int numero){
        numerosApostados.add(numero);
    }
    
    
    
    
            
}
