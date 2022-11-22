package egzamen1;

import java.util.Scanner;

public class Egzamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан жазыныз: ");
        int num = sc.nextInt();
        System.out.print("Экинчи санды жазыныз: ");
        int num2 = sc.nextInt();
        int counter = 0, i = 0;
        counter = num-num2;
        System.out.println("Кемитиндиси: " + counter);
        while (counter > 0) {
            System.out.print("Сан жазыныз: ");
            int num3 = sc.nextInt();
            i = counter - num3;
            System.out.println("Кемитиндиси: " + i);
            counter-=num3;
            if (counter == 0){
                System.out.println("Нолго жеттик!!");
            }
        }

    }
}
