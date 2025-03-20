package Sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        String[] array = {"banana", "maçã", "laranja", "uva", "abacaxi"};

        int n = array.length;
        String temp;

        // Passando por todos os elementos do array
        for (int i = 0; i < n - 1; i++) {

            // Comparando elementos adjacentes
            for (int j = 0; j < n - i - 1; j++) {

                // Se o elemento da posição j é maior que o da posição j+1, troque-os
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Troca os elementos
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
