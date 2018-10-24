/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotofacil;

import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class Lotofacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("##### Bem-vindo ao sistema Lotofácil!! ######");
        //Enquanto a Cartela não estiver concluida
        
        Cartela cartela = new Cartela();
        
        while(!cartela.isApostaConcluida()){
            System.out.println("Digite um Número para a aposta");
            int numero = teclado.nextInt();
            boolean marcouNumero = cartela.marcarNumero(numero);
            System.out.println(marcouNumero?"Marcado\n\n":"Nao Foi Possivel Marcar Esse numero jah existe\n\n");
        }
        
        //Sortear 15 numeros (de 1 a 25 sem repetir)
        Loterica loterica = new Loterica();
        loterica.sorteiaNumeros();
        
        
        //pegar apostas e comparar o resultado
        //mostrar o resultado de cada aposta
        String resultado = loterica.resultado(cartela);
        System.out.println("\n\n####  "+ resultado + " ########\n\n");
                
    }
    
}
