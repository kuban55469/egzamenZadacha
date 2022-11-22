package egzamen2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Student деген класс тузунуз.
         * Полялары : String fullName,int age,String email,Gender gender, enum болсун.
         * Баардык эске алынуучу нерселерди эске алыныз.
         * ~~~~~~~Methods~~~~~~~
         * StudentAble деген интерфейстин ичине тузунуз методдорду.
         * 1-Баардык студенттерди чыгарып беруучу метод тузунуз.
         * 2-бардык балдарды чыгарып беруучу метод жазыныз.
         * 3-бардык кыздарды чыгарып беруучу метод жазыныз.
         * 4-аты менен тапчуу метод жазыныз.
         * 5-баардык студенттердин жашын сорттоп чыгарып бериниз.
         * 6-студенттин фамилиясын кайтарчуу метод тузунуз.
         */

        Student[] students = {
                new Student("Kuban Kelsinbekov", 18, "kuban@gail.com", Gender.MALE),
                new Student("Janara Malicova", 19, "janara@gmail.com", Gender.FEMALE),
                new Student("Janushbek Akbalaev", 20, "janysh@gmail.com", Gender.MALE),
                new Student("Meerim Jumanazarova", 22, "meerim@gmail.com", Gender.FEMALE),
                };

        Scanner scanner = new Scanner(System.in);

        for (Student student : students) {
            student.getAllStudent(students);
            System.out.println("\nBoys:");
            student.getAllBoys(students);
            System.out.println("\nGirls: ");
            student.getAllGirl(students);
            System.out.println("\nEnter Name: ");
            student.getName(scanner.nextLine(), students);
            System.out.println("\nSur names: ");
            student.getSurName(students);
            System.out.println("\nSort age: ");
            student.getAllSortAge(students);
            break;
        }
    }
}
