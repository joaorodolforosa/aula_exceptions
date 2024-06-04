package br.uam.psc;

/**
 *
 * @author Rodolfo
 */
public class UsoDeFinally {

    public static void geradorDeExcecao(int denominador) {
        int t;
        int nums[] = new int[2];

        System.out.println("Recebendo " + denominador);
        try {
            switch (denominador) {
                case 0:
                    t = 10 / denominador;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException ex) {
            System.out.println("Náo é possível dividir por 0");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Índice de array fora dos limite");
        } finally {
            System.out.println("Tentativa de finalização");
        }
    }

}
