/*  Na "QuickSort" toda organização do vetor desordenado é feita pelo método de
Ordenação Rápida, que faz parte dos métodos de Ordenação por Particionamento. Tal 
método é baseado na estratégia de divisão e conquista, a lista é dividida em parte esquerda 
e parte direita, sendo que os elementos da parte esquerda são todos menores que os 
elementos da parte direita. Essa fase do método é chamada de partição (para fazer essa
partição podemos escolher um valor como pivô e então colocar na parte esquerda os 
elementos menores ou iguais ao pivô e na parte direita os elementos maiores que o pivô.  */

package menu;

public class QuickSort {

    public void ordenarPorQuick(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
    }

    private void quickSort(int[] vetor, int inicio, int fim) {
        if (fim > inicio) {
            int indexPivo = dividir(vetor, inicio, fim);

            quickSort(vetor, inicio, indexPivo - 1);

            quickSort(vetor, indexPivo + 1, fim);
        }
    }

    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while (pontEsq <= pontDir) {
            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }
            while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

}
