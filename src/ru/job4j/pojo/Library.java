package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Game of Thrones", 500);
        Book book2 = new Book("The Lords of the Rings", 1000);
        Book book3 = new Book("Hangers games", 800);
        Book book4 = new Book("Clean code", 900);
        Book[] massiv = new Book[]{book1, book2, book3, book4};
        for (int i = 0; i < massiv.length; i++) {
            Book bk = massiv[i];
            System.out.println(bk.getName() + " " + bk.getPage());
        }
        System.out.println();
        Book buffer = massiv[3];
        massiv[3] = massiv[0];
        massiv[0] = buffer;
        for (int i = 0; i < massiv.length; i++) {
            Book bk = massiv[i];
            System.out.println(bk.getName() + " " + bk.getPage());
        }
        System.out.println();
        for (int i = 0; i < massiv.length; i++) {
            Book bk = massiv[i];
            if (massiv[i].getName().equals("Clean code")) {
                System.out.println(massiv[i].getName() + " " + massiv[i].getPage());
            }
        }
    }
}
