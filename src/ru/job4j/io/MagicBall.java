package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;
import java.util.logging.SocketHandler;

public class MagicBall {

    public static void main(String[] args) {
        System.out.println("Я великий оракул, что тебе предсказать?");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
            System.out.println("Может быть да, может быть нет.");
            break;
            case 1:
                System.out.println("Тебе больше нечего спрашивать?");
                break;
            case 2:
                System.out.println("Да, а что?");
                break;
            case 3:
                System.out.println("Посмотри в телефоне.");
                break;
            default:
                break;
        }
    }
}