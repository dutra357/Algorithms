package Sort;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Chose the size of de Array: ");
        int size = sc.nextInt();

        System.out.println();

        System.out.print("Now, chose the máximum number: ");
        int limit = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= size; i++ ) {
            int number = rand.nextInt(limit + 1);
            list.add(number);
        }

        Integer element = (Integer) findMinor(list);
        System.out.println();
        System.out.printf("The minor number is: %d", list.get(element));


        sc.close();
    }

    //  Big O(n)
    public static int findMinor(List list) {
        int minor = (int) list.get(0);
        int minorIndex = 0;
        int count = 0;

        for (int i = 0; i < list.size(); i++){
            if ((int) list.get(i) < minor) {
                minorIndex = i;
            }
            count++;
        }
        System.out.printf("Attempts: %d", count);
        return minorIndex;
    }
}
