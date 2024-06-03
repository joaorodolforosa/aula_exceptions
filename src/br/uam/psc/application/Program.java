// Exemplo de exceção não capturada
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
        } catch (ArithmeticException ex) {
            System.out.println("Índice de array fora dos limite");
        }
        System.out.println("Como a exceção não foi capturada este trecho não será executado");
    }

}
