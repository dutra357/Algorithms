package Sort;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {

    /**
     * Divide em parte ordenada e parte não ordenada. O primeiro, por definiçao
     * sendo ordenado, passa a ser comparado com os demais.
     *
     * Percorrendo um vetor, comparando com o próximo elemento do grupo não ordenado,
     * caso seja este maior, troca de posição. Assim, o vetor ordenado passa a ganhar também mais
     * um elemento (candidato).
     *
     * Ineficiente para grandes conjuntos, com O(n2).
     */

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Encontra o menor elemento na parte não ordenada
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Troca o menor elemento encontrado com o elemento na posição i
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
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

        selectionSort(array);

        System.out.println("Array ordenado:");
        printArray(array);
    }
}
