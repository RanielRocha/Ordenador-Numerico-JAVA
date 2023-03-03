/*  Essa classe "GeradorNumerico" serve para que o programa gere de forma autônoma uma
quantidade de números (de 0 a 999), selecionada pelo usuário no menu, de forma aleatória
(forma randômica) e desordenada.  */

package menu;

import java.util.Random;

public class GeradorNumerico {

    public void gerador(int[] vetor) {
        Random num = new Random();

        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = num.nextInt(1000);
            
            System.out.println(i + "º -> " + vetor[i]);

            if (vetor[i] == 999) {
                cont++;
            }
        }
        System.out.println("\n\nExistem " + cont + " número(s) 999!!");
    }

}
