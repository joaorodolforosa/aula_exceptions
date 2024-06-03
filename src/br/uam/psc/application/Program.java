// Exemplo de exceção capturada e tratada
package br.uam.psc.application;

/**
 *
 * @author Joao Rodolfo
 */
public class Program {

    public static void main(String[] args) {

        int nums[] = new int[4];

        try {
            nums[7] = 10;

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Índice de array fora dos limite");
        }

        System.out.println("Exemplo de um erro capturado e tratado");
    }

}
