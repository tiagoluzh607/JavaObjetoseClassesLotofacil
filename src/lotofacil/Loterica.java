/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotofacil;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tiago
 */
public class Loterica {
    
    private ArrayList<Integer> numerosSorteados;

    public Loterica() {
        this.numerosSorteados = new ArrayList<>();
    }
    
    public boolean isSorteioConcluido(){
        return numerosSorteados.size() >= 15;
    }
    
    public void sorteiaNumeros(){
        while(!isSorteioConcluido()){
            Random gerador = new Random();
            int numeroSorteado = gerador.nextInt(24);
            numeroSorteado++;
            marcarNumero(numeroSorteado);
        }
    }
    
    public boolean marcarNumero(int numero){
        
        if(numeroRepetido(numero) || isSorteioConcluido()|| numeroInvalido(numero)){
            return false;
        }
    
        return numerosSorteados.add(numero);
        
    }

    private boolean numeroInvalido(int numero) {
        return numero < 1 || numero > 25;
    }

    private boolean numeroRepetido(int numero) {
        return numerosSorteados.contains(numero);
    }
    
}
