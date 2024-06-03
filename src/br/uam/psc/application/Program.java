// Exemplo de exceção gerada na chamada do método
package br.uam.psc.application;

import br.uam.psc.TesteExcecao;

/**
 *
 * @author Joao Rodolfo
 */
public class Program {

    public static void main(String[] args) {

        try {
            TesteExcecao.geradorDeExceção();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Índice de array fora dos limite");
            ex.printStackTrace();
        }
        System.out.println("Exemplo de uma exceção caturada e tratada na chamada do método");
    }

}
