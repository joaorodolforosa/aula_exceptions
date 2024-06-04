// Exemplo de várias exceções capturadas
package br.uam.psc.application;

import br.uam.psc.UsoDeFinally;

/**
 *
 * @author Joao Rodolfo
 */
public class Program {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            UsoDeFinally.geradorDeExcecao(i);
            System.out.println();
        }
    }
}
