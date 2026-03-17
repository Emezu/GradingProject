import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("How many students? ");
        int count = scanner.nextInt();
        Student[] students = new Student[count];

        for (int i = 0; i < count; i++) {
            students[i] = new Student();

            System.out.println("What is the student name? ");
            students[i].name = scanner.next();

            System.out.println("What is the student's score? ");
            students[i].score = scanner.nextDouble();
        }
        System.out.println("\nName     Score     Grade");
        System.out.println("___________________________");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-12s%-8.1f%s%n", students[i].name, students[i].score, students[i].getGrade());


        }
    }
}