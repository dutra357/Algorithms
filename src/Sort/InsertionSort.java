package Sort;

public class InsertionSort {

    /**
     * Mais eficiente do que o BubbleSort para arrays pequenos ou
     * listas parcialmente ordenadas, mas também com complexidade O(n2).
     *
     * Funcionamento semelhando à forma como organizamos as cartas
     * de um baralho. Assume que o primeiro elemento já está ordenado,
     * então compara o próximo com os anteriores. Insere no local correto,
     * e repete o ciclo.
     *
     * Tempo O(n2). Melhor caso com array já ordenado.
     */

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Elemento atual a ser inserido na posição correta
            int j = i - 1;

            // Move os elementos maiores que 'key' uma posição à frente
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insere 'key' na posição correta
            arr[j + 1] = key;
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

        insertionSort(array);

        System.out.println("Array ordenado:");
        printArray(array);
    }
}
