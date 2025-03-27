package Sort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Pouco eficiente no geral, possuindo tempo O(n2).
     *
     * O nome do algoritimo se refere à bolha que, semelhantemente,
     * vão subindo do fundo.
     * Funciona comparando os elementos adjacentes, e os substituindo
     * caso estejam na ordem inversa da almejada.
     *
     * Encerra quando nenhuma troca for necessária.
     *
     * Possui melhor caso com a flag 'swapped', onde O(n).
     */

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Array original:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Array ordenado:");
        printArray(array);
    }
}
