// Exemplo de exceção não capturada e tratada
package br.uam.psc.application;

/**
 *
 * @author Joao Rodolfo
 */
public class Program {
    public static void main(String[] args) {
        
        int nums[] = new int[4];
        
        nums[7] = 10;
        
        System.out.println("Exemplo de um erro não tratado");
    }
    
}
