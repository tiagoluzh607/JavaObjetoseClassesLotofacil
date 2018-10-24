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
    
    
    public String resultado(Cartela cartela){
        
        int acertos = 0;
        acertos = calculaNumeroDeAcertos(cartela, acertos);
        return verificaPremiacao(acertos);
    }

    private String verificaPremiacao(int acertos) {
        //faz uma pontuacao de acertos
        //Segundo a pontucao exibe a pontuacao em string
        //segundo a pontuacao retorna o premio em string
        
        switch (acertos) {
            case 11:
                return "Você acertou "+acertos+" Ganhou R$ 4,00";
                
            case 12:
                
                return "Você acertou "+acertos+" Ganhou R$ 8,00";
            case 13:
                
                return "Você acertou "+acertos+" Ganhou R$ 20,00";
            case 14:
                
                return "Você acertou "+acertos+" Ganhou R$ 2.086,62";
            case 15:
                
                return "Você acertou "+acertos+" Ganhou R$ 1.108.458,91";
            default:
                return "Você acertou "+acertos+" Infelizmente não Ganhou Nada";
        }
    }

    private int calculaNumeroDeAcertos(Cartela cartela, int acertos) {
        ArrayList<Integer> numerosApostados = cartela.getNumerosApostados();
        //verifica quantos numeros foram acertados
        for (Integer numeroApostado : numerosApostados) {
            if(numerosSorteados.contains(numeroApostado)){
                acertos++;
            }
        }
        return acertos;
    }
    
}
