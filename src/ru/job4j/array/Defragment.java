package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
            for (int i = 0; i < array.length; i++) {
                int nullIndex = 0;
                int notNullIndex = 0;
                if (array[i] == null) {
                    nullIndex = i;
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] != null) {
                            notNullIndex = j;

                            array[nullIndex] = array[notNullIndex];
                            array[notNullIndex] = null;
                            break;
                        }
                    }
                }
            }

        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}