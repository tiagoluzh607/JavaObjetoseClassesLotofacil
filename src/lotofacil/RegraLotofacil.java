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
public class RegraLotofacil {
    
    public boolean isCartelaConcluida(ArrayList<Integer> numeros) {   
        return numeros.size() >= 15;
    }
    
    public boolean marcarNumero(int numero, ArrayList<Integer> numeros){
        
        if(numeroRepetido(numero,numeros) || isCartelaConcluida(numeros)|| numeroInvalido(numero)){
            return false;
        }
    
        return numeros.add(numero);
        
    }

    private boolean numeroInvalido(int numero) {
        return numero < 1 || numero > 25;
    }

    private boolean numeroRepetido(int numero, ArrayList<Integer> numeros) {
        return numeros.contains(numero);
    }
    
}
