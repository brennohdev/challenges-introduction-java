package challenges.introduction;

import java.util.Scanner;

public class ClassClientsSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        boolean isNegative = age < 0;

        if (isNegative) {
            System.out.println("Invalid age. Please enter a non-negative value.");
            return;
        }

        boolean isChildren = age > 0 && age <= 12;
        boolean isTeenager = age >= 13 && age <= 17;
        boolean isAdult = age >= 18 && age <= 59;


        if (isChildren) {
            System.out.println(name + " is " + age + " years old and is classified as: Children.");
        } else if (isTeenager) {
            System.out.println(name + " is " + age + " years old and is classified as: Teenager.");
        } else if (isAdult) {
            System.out.println(name + " is " + age + " years old and is classified as: Adult.");
        } else {
            System.out.println(name + " is " + age + " years old and is classified as: Senior.");
        }
    }
}
