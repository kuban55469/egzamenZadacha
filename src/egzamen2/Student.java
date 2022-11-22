package egzamen2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student implements StudentAble{
    private String fullName;
    private int age;
    private String email;
    private Gender gender;

    public Student() {
    }

    public Student(String fullName, int age, String email, Gender gender) {
        this.fullName = fullName;
        if (age > 0 && age < 120) {
            this.age = age;
        }else {
            System.out.println("Error age!!");
        }
        if (email.contains("@")) {
            this.email = email;
        }else {
            System.out.println("Error email!!");
        }
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void getAllStudent(Student[] students) {
        for (Student student : students) {
            System.out.println(student.fullName);
        }
    }

    @Override
    public void getAllBoys(Student[] students) {
        for (Student student : students) {
            if (student.gender.equals(Gender.MALE)){
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void getAllGirl(Student[] students) {
        for (Student student : students) {
            if (student.gender.equals(Gender.FEMALE)){
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void getName(String name, Student[] students) {
        for (Student student : students) {
            String[] lst = student.getFullName().split(" ");
            if (lst[0].equals(name)) {
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void getAllSortAge(Student[] students) {
        int counter = 0;
        for (Student student : students) {
            if (student.age > counter ){
                counter = student.age;
                System.out.println(counter+" year. " + student.toString());
            }
        }
    }

    @Override
    public void getSurName(Student[] students) {
        for (Student student : students) {
            String[] lst = student.getFullName().split(" ");
            System.out.println(lst[1]);
        }
    }
}
