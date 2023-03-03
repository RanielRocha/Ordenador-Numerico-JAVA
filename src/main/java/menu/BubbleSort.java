/*  Nessa classe "BubbleSort" a ordenação é feita pelo método da Bolha, ocorrendo por meio 
da comparação entre dois elementos e sua troca, de modo que o elemento de maior valor 
fique à direita do outro.   */

package menu;

public class BubbleSort {

    public void ordenarPorBubble(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length; i++) {

            for (int j = 0; j < vetor.length - 1; j++) {

                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

}
