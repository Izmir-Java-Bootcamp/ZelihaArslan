package com.company.kodluyoruz;

import java.util.Scanner;

/*
 equalsIgnoreCase: metinlerin karşılaştırmasını yapar.
 contains: String içinde arama yapmamızı sağlar.
 substring: Stringlerde ilk parametreden ikinci parametreye kadar bir karakter kümesi elde etmemizi sağlar.
 */
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pattern string: ");
        String pattern = scanner.nextLine();

        while (true) {
            System.out.println("Enter a string: ");
            String str = scanner.nextLine();

            if (occursIn(pattern, str)) {
                System.out.println(pattern + " occurs in " + str + " ");
            } else {
                System.out.println(pattern + " does Not occur in " + str + "");
            }
            if (str.equals("exit")) {
                System.out.println("Bye");
                return;
            }

        }

    }
    //örnek cümlenin  içindeki karakterleri kontrol ederek girilen string ifade  ile ortak olan karakterleri arar ve varsa true yoksa false döndürür
    public static boolean occursIn(String pattern, String str) {
        for (int i = 0; i < pattern.length(); i++) {
            String s = pattern.substring(i, i + 1);
            if (!"*".equalsIgnoreCase(s) && !str.contains(s)) {
                return false;
            }
        }
        return true;
    }

}
