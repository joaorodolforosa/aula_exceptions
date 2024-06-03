// Exemplo de várias exceções capturadas
package br.uam.psc.application;

/**
 *
 * @author Joao Rodolfo
 */
public class Program {

    public static void main(String[] args) {

        int numerador[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denominador[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numerador.length; i++) {
            try {
                System.out.println(numerador[i] + " / " + denominador[i] + " = "
                        + numerador[i] / denominador[i]);
            } catch (ArithmeticException ex) {
                System.out.println("Não é possível a divisão por zero");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Não há elemento correspondente");
            }
        }
    }
}
