package Sort;

public class InsertionSort {

    public static void main(String[] args) {

        /**
         * Mais eficiente do que o BubbleSort para arrays pequenos ou
         * listas parcialmente ordenadas, mas também com complexidade O(n2).
         */

        String[] array = {"banana", "maçã", "laranja", "uva", "abacaxi"};
        ordenarArray(array);

        for (String item : array) {
            System.out.println(item);
        }
    }

    public static void ordenarArray(String[] array) {
        int n = array.length;

        // Passando por todos os elementos do array, começando do segundo
        for (int i = 1; i < n; i++) {
            String chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(chave) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = chave;
        }
    }
}
