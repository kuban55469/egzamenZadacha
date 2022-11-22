package egzamen1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        int k = 1;
//        for (int i = 0; i < 7; i++) {
//            for (int l = 0; l < i + 1; l++) {
//                System.out.print(k++ + " ");
//            }
//            System.out.println();
//        }
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows");
//        int num = sc.nextInt();
//        for (int i = 0; i <= num; i++) {
//            for (int j = num - 1; j >= i; j--) {
//                System.out.print(" ");
//            }
//
//            for (int l = 1; l <= i ; l++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("До сортировки: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20,100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("После сортировки: ");
        Arrays.sort(array);
        int[] array1 = new int[array.length];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array[i];
            System.out.print(array1[i] + " ");
        }

    }

}



