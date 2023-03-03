/*  A classe "SelectionSort" está responsável por fazer a ordenação da sequência numérica
gerada pelo método da Seleção Direta, que basicamente pega o elemento de menor valor 
entre os elementos da lista é selecionado e em seguida é feita a troca deste elemento com 
o primeiro elemento i, em seguida são selecionados e permutados os elementos de menor 
valor para as posições seguintes.  */

package menu;

public class SelectionSort {

    public void ordenarPorSelection(int[] vetor) {
        for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[menor]) {
                    menor = i;
                }
            }

            int t = vetor[fixo];
            if (menor != fixo) {
                vetor[fixo] = vetor[menor];
                vetor[menor] = t;
            }
        }
    }

}
