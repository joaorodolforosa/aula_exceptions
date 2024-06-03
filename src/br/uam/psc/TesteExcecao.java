// Classe para teste de exceção gerada na chamada do método
package br.uam.psc;

/**
 *
 * @author Rodolfo
 */
public class TesteExcecao {

    public static void geradorDeExceção() {
        int nums[] = new int[4];
        System.out.println("A exceção ainda não foi gerada");
        nums[7] = 10;
        System.out.println("A exceção foi gerada e este trecho do código não será executado");
    }
}
