package challenges.introduction;

import java.util.Scanner;

public class VerifyUserAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many people you want to check: ");
        int quantityOfPeople = scanner.nextInt();

        int legalAgeCount = 0;

        for (int i = 0; i < quantityOfPeople; i++) {
            System.out.println("Enter the person " + (i + 1) + ": ");
            int userAge = scanner.nextInt();

            boolean isUserAge = userAge >= 18;

            if (isUserAge) {
                legalAgeCount++;
            }

        }

        System.out.println("Number of people of legal age: " + legalAgeCount);
        scanner.close();
    }
}
