/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.harfler;

import java.util.Scanner;

/**
 *
 * @author ÖMER ÜREN
 */
public class Letters {
    static Scanner inp = new Scanner(System.in);

    // this function checks if the string input contains digit
    static boolean IsAlphabetic(String text) {

        for (int i = 0; i < text.length(); i++) {

            if (!Character.isAlphabetic(text.charAt(i))) {
                return false;
            }

        }
        return true;
    }

    // try parse function for if user enter a exception number
    static boolean TryParse(String text, int[] result) {
        try {
            result[0] = Integer.parseInt(text);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    // this function return the String input
    static String TakeInp(String text) {
        System.out.print(text);
        return inp.next();
    }

    public static void main(String[] args) {

        int num = 0;

        while (true) {

            String input = TakeInp("Enter a number");

            int result[] = new int[1];

            if (TryParse(input, result)) {
                num = result[0];
                break;
            } else {
                System.out.println("Please enter a correct number ");
            }
        }

        while (true) {

            String text = TakeInp("Enter a text : ");

            if (IsAlphabetic(text)) {
                letter letr = new letter(num, text);
                break;
            } else
                System.out.println("Your text cannot contain digit !");
        }

    }
}
