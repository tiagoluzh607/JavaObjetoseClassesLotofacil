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
public class Cartela extends RegraLotofacil{
    

    private ArrayList<Integer> numerosApostados;
    
    public Cartela(){
        numerosApostados =  new ArrayList<>();
    }

    public boolean isApostaConcluida() {   
        return super.isCartelaConcluida(numerosApostados);
    }
    
    public boolean marcarNumero(int numero){
        return super.marcarNumero(numero, numerosApostados);
    }    

    public ArrayList<Integer> getNumerosApostados() {
        return numerosApostados;
    }
            
    
}
