/*  Na classe "MenuPrincipal" está implementado toda a parte que será feita a interação
do sistema com o usuário, onde através de Menus, o usuário vai escolhendo as opções
desejadas, desde a quantidade de números a serem gerados e a forma de ordenação
que mais preferir fazer.   */

package menu;

import interfaces.InterfaceProjeto;

public class MenuPrincipal implements InterfaceProjeto {

    private int[] numerosDesordenados;
    private int[] numerosOrdenados;
    long tempoSelection;
    long tempoBubble;
    long tempoQuick;

    public MenuPrincipal() {
        this.menuPrincipal();
    }

    private void menuPrincipal() {
        int opcao = 0;
        boolean encontrou = false;

        System.out.println("\nSISTEMA DE ORDENAÇÃO DE NÚMEROS DE"
                + "\n        DIFERENTES QUANTIDADES E ALEATÓRIOS!!\n");

        while (true) {
            int[] quantidadeNum;

            System.out.println("\n******                    MENU PRINCIPAL               ******");
            System.out.println("Escolha a quantidade de números a serem gerados: ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1 - 1.000 Números");
            System.out.println("2 - 5.000 Números");
            System.out.println("3 - 10.000 Números");
            System.out.println("4 - 30.000 Números");
            System.out.println("5 - 50.000 Números");
            System.out.println("0 - Sair");

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Entre com a opção desejada: ");
            opcao = leia.nextInt();

            quantidadeNum = new int[0];
            switch (opcao) {
                case 1:
                    System.out.println("\nVocê escolheu 1.000 Números!!\n");
                    quantidadeNum = new int[1000];
                    gerador(quantidadeNum);

                    switch (this.subMenu()) {
                        case 1:
                            selectionSort(numerosDesordenados);
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            break;
                        case 2:
                            bubbleSort(numerosDesordenados);
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            break;
                        case 3:
                            quickSort(numerosDesordenados);
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                        case 4:
                            selectionSort(numerosDesordenados);
                            bubbleSort(numerosDesordenados);
                            quickSort(numerosDesordenados);
                            System.out.print("\n");
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nVocê escolheu 5.000 Números!!");
                    quantidadeNum = new int[5000];
                    gerador(quantidadeNum);

                    switch (this.subMenu()) {
                        case 1:
                            selectionSort(numerosDesordenados);
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            break;
                        case 2:
                            bubbleSort(numerosDesordenados);
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            break;
                        case 3:
                            quickSort(numerosDesordenados);
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                        case 4:
                            selectionSort(numerosDesordenados);
                            bubbleSort(numerosDesordenados);
                            quickSort(numerosDesordenados);
                            System.out.print("\n");
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\nVocê escolheu 10.000 Números!!");
                    quantidadeNum = new int[10000];
                    gerador(quantidadeNum);

                    switch (this.subMenu()) {
                        case 1:
                            selectionSort(numerosDesordenados);
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            break;
                        case 2:
                            bubbleSort(numerosDesordenados);
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            break;
                        case 3:
                            quickSort(numerosDesordenados);
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                        case 4:
                            selectionSort(numerosDesordenados);
                            bubbleSort(numerosDesordenados);
                            quickSort(numerosDesordenados);
                            System.out.print("\n");
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("\nVocê escolheu 30.000 Números!!");
                    quantidadeNum = new int[30000];
                    gerador(quantidadeNum);

                    switch (this.subMenu()) {
                        case 1:
                            selectionSort(numerosDesordenados);
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            break;
                        case 2:
                            bubbleSort(numerosDesordenados);
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            break;
                        case 3:
                            quickSort(numerosDesordenados);
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                        case 4:
                            selectionSort(numerosDesordenados);
                            bubbleSort(numerosDesordenados);
                            quickSort(numerosDesordenados);
                            System.out.print("\n");
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("\nVocê escolheu 50.000 Números!!");
                    quantidadeNum = new int[50000];
                    gerador(quantidadeNum);

                    switch (this.subMenu()) {
                        case 1:
                            selectionSort(numerosDesordenados);
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            break;
                        case 2:
                            bubbleSort(numerosDesordenados);
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            break;
                        case 3:
                            quickSort(numerosDesordenados);
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                        case 4:
                            selectionSort(numerosDesordenados);
                            bubbleSort(numerosDesordenados);
                            quickSort(numerosDesordenados);
                            System.out.print("\n");
                            System.out.println("O Selection Sort foi executado em: " + tempoSelection + " ms");
                            System.out.println("O Bubble Sort foi executado em: " + tempoBubble + " ms");
                            System.out.println("O Quick Sort foi executado em: " + tempoQuick + " ms");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("\nSISTEMA FINALIZADO!!");
                    System.exit(0);
                default:
                    System.out.println("\n***   Opção Inválida, digite novamente!!   ***");
            }
        }
    }

    private int subMenu() {
        int submenu = 1;
        do {
            System.out.println("\n******                             SUBMENU                           ******");
            System.out.println("Escolha o Método de Ordenação para os números gerados: ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1 - Selection Sort (Seleção)");
            System.out.println("2 - Bubble Sort (Bolha)");
            System.out.println("3 - Quick Sort (Ordenação Rápida)");
            System.out.println("4 - Todos os Métodos");
            System.out.println("0 - Voltar para o Menu Principal");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Entre com a opção desejada: ");
            submenu = leia.nextInt();
        } while (submenu < 0 || submenu > 5);
        return submenu;
    }

    public void gerador(int[] quantidadeNum) {
        GeradorNumerico geradorNumeros = new GeradorNumerico();
        geradorNumeros.gerador(quantidadeNum);

        numerosDesordenados = quantidadeNum;
    }

    public void selectionSort(int[] numerosDesordenados) {
        SelectionSort selection = new SelectionSort();

        long tempoInicial = System.currentTimeMillis();
        selection.ordenarPorSelection(numerosDesordenados);
        long tempoFinal = System.currentTimeMillis();
        tempoSelection = tempoFinal - tempoInicial;

        numerosOrdenados = numerosDesordenados;
        System.out.println("\nVetor organizado por SELECTION SORT: ");
        for (int i = 1; i < numerosOrdenados.length; i++) {
            System.out.println(i + "º -> " + numerosOrdenados[i]);
        }
    }

    public void bubbleSort(int[] numerosDesordenados) {
        BubbleSort bubble = new BubbleSort();

        long tempoInicial = System.currentTimeMillis();
        bubble.ordenarPorBubble(numerosDesordenados);
        long tempoFinal = System.currentTimeMillis();
        tempoBubble = tempoFinal - tempoInicial;

        numerosOrdenados = numerosDesordenados;
        System.out.println("\nVetor organizado por BUBBLE SORT: ");
        for (int i = 1; i < numerosOrdenados.length; i++) {
            System.out.println(i + "º -> " + numerosOrdenados[i]);
        }
    }

    public void quickSort(int[] numerosDesordenados) {
        QuickSort quick = new QuickSort();

        long tempoInicial = System.currentTimeMillis();
        quick.ordenarPorQuick(numerosDesordenados);
        long tempoFinal = System.currentTimeMillis();
        tempoQuick = tempoFinal - tempoInicial;

        numerosOrdenados = numerosDesordenados;
        System.out.println("\nVetor organizado por QUICK SORT: ");
        for (int i = 1; i < numerosOrdenados.length; i++) {
            System.out.println(i + "º -> " + numerosOrdenados[i]);
        }
    }

}
