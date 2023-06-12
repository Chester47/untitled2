package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш ник: ");
        String playerName = scanner.nextLine();
        System.out.print("Введите ваш логин: ");
        String playerLogin = scanner.nextLine();
        System.out.println("Ник: " + playerName);
        System.out.println("Логин: " + playerLogin);
    }
}