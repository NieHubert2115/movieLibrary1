package Tools;

import models.Actor;

import java.util.Scanner;

public class UserInputHandler {

    static Scanner scanner = new Scanner(System.in);

    public static MenuOption getMenuOptionFromUser(){
        return MenuOption.values()[getSelectedOptionFromUser() -1];
    }

    private static int getSelectedOptionFromUser() {

        int result = getIntigerFromUser();
        scanner.nextLine();
        if (result > 0 && result < 4) {

            return result;

        } else {
            System.out.println("You selected wrong option. Please try again.");
            return getSelectedOptionFromUser();
        }

    }

    private static int getIntigerFromUser() {
        while (!scanner.hasNextInt()) {

            scanner.nextLine();
            System.out.println("Wrong. It is not intiger. Try again.");

        }

        return scanner.nextInt();

    }

    public static Actor getActorFromUser() {
        System.out.println("Type an actor: ");
        String[] actors = scanner.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);
    }
}
