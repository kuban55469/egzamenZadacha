package egzamen1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] massive = {1, 2, 56, 48, 57, 56, 24, 13, 21, 45};
        Arrays.sort(massive);
        System.out.println(Arrays.toString(massive));
        getArray();
        getTable();
    }

    public static void getArray() {
        Random rd = new Random();
        int[] massive = new int[20];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = rd.nextInt(1, 5000);
        }
        Arrays.sort(massive);
        System.out.print(Arrays.toString(massive) + " ");
        System.out.println();
    }

    public static void getTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int counter1 = sc.nextInt();
        for (int j = 1; j <10; j++) {
            System.out.println();
            for (int i = 1; i <= 10; i++) {
                int counter = 0;
                counter += i * counter1;

                System.out.println(counter1 + " * " + i + " = " + counter);
            }
            counter1++;
        }
    }
}