// Exemplo de uso de throw
package br.uam.psc.application;

/**
 *
 * @author Joao Rodolfo
 */
public class Program {

    public static void main(String[] args) {
        try {
            System.out.println("Lançamento de uma exceção com throw");
            throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            System.out.println("Exceção ArithmeticException capturada");
        }
        System.out.println("Após execução do bloco try/catch");
    }
}
