package app.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FormRuleValidator {

    public static Scanner sc = new Scanner(System.in);

    public static int validateInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero valido" + e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static Double validateDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                Double value = sc.nextDouble();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero decimal válido" + e.getMessage());
                sc.nextLine();

            }
        }
    }
    public static Boolean validateBoolean (String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                Boolean value = sc.nextBoolean();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero booleano válido" + e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static String validateString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine();

        }
    }
}
