package binarySearch;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 102400; i++ ) {
            list.add(i);
        }

        System.out.print("Chose a number: ");
        int one = sc.nextInt();

        System.out.println();

        System.out.println("Try catch in..");

        testLoopNumber(list, one);

        sc.close();
    }

    public static void testLoopNumber(List<Integer> list, int one){
        int low = 0;
        int hight = list.size();

        boolean flag = true;
        int i = 0;

        while (flag) {
            int medium = (low + hight)/2;
            i++;

            if(one == medium) {
                System.out.println("Catch!");
                System.out.printf("Attempt: %d", i);
                flag = false;
            }

            if (medium < one) {
                low = medium + 1;
            }

            else if (medium > one) {
                hight = medium - 1;
            }
        }
    }

    public static void testAlphabetic() {

    }
}
