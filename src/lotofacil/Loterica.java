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
        Random gerador = new Random();
        int numeroSorteado = gerador.nextInt(24);
        numeroSorteado++;
        //Como adicionar? não deve ter as mesmas validações que tem no método adicionar em cartela?
    }
    
    
}