package challenges.introduction;

import java.util.Scanner;

public class UserLoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you age: ");
        int userAge = scanner.nextInt();
        boolean isUserAbleToLogin = userAge > 16;

        if (userAge < 0) {
            System.out.println("Access denied, please enter a valid age.");
        } else if (isUserAbleToLogin) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        scanner.close();
    }
}
