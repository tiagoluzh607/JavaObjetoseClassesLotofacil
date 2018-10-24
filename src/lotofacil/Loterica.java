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
public class Loterica extends RegraLotofacil{
    
    private ArrayList<Integer> numerosSorteados;

    public Loterica() {
        this.numerosSorteados = new ArrayList<>();
    }
    
    public void sorteiaNumeros(){
        while(!super.isCartelaConcluida(numerosSorteados)){
            Random gerador = new Random();
            int numeroSorteado = gerador.nextInt(24);
            numeroSorteado++;
            super.marcarNumero(numeroSorteado, numerosSorteados);
        }
    }
    
}
