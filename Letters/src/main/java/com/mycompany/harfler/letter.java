/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.harfler;

/**
 *
 * @author ÖMER ÜREN
 */
public class letter {
    int number1 = 0;
    String text = "";

    public letter(int number, String text1) {
        Letters(number, text1);
    }

    private void Letters(int number, String text1) {
        this.number1 = number;
        this.text = text1.toLowerCase();
        int numOfLetter = 2 * this.number1 - 1;

        for (int i = 1; i <= numOfLetter; i++) {
            for (char letter : this.text.toCharArray()) {
                switch (letter) {
                    case 'a' -> LetterA(i);
                    case 'b' -> LetterB(i);
                    case 'c' -> LetterC(i);
                    case 'd' -> LetterD(i);
                    case 'e' -> LetterE(i);
                    case 'f' -> LetterF(i);
                    case 'g' -> LetterG(i);
                    case 'h' -> LetterH(i);
                    case 'i' -> LetterI(i);
                    case 'j' -> LetterJ(i);
                    case 'k' -> LetterK(i);
                    case 'l' -> LetterL(i);
                    case 'm' -> LetterM(i);
                    case 'n' -> LetterN(i);
                    case 'o' -> LetterO(i);
                    case 'ö' -> LetterOo(i);
                    case 'p' -> LetterP(i);
                    case 'q' -> LetterQ(i);
                    case 'r' -> LetterR(i);
                    case 's' -> LetterS(i);
                    case 't' -> LetterT(i);
                    case 'u' -> LetterU(i);
                    case 'v' -> LetterV(i);
                    case 'w' -> LetterW(i);
                    case 'y' -> LetterY(i);
                    case 'z' -> LetterZ(i);
                    default -> InsertSpace();
                }
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    private void LetterA(int line) {

        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {

            if (line == 1 || i == 1 || i == newNumber || line == this.number1) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterB(int line) {
        /*
         * xxxxxxx
         * x x
         * x x
         * xxxxxxx
         * x x
         * x x
         * xxxxxxx
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1) || (line == 1 && i != newNumber) || (line == this.number1 && i != newNumber)
                    || (line == newNumber && i != newNumber)
                    || (i == newNumber && line != 1 && line != this.number1 && line != newNumber)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }
    }

    private void LetterC(int line) {
        /*
         * xxxxxxx
         * x
         * x
         * x
         * x
         * xxxxxxx
         */
        int newLine = 2 * this.number1 - 1;
        for (int i = 1; i <= newLine + 2; i++) {
            if ((i == 1 && line != 1 && line != newLine) || (line == 1 && i != 1) || (line == newLine && i != 1)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }
    }

    private void LetterD(int line) {
        /*
         * xxxxxxx
         * x x
         * x x
         * x x
         * x x
         * xxxxxxx
         */

        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1) || (line == 1 && i != newNumber) || (line == newNumber && i != newNumber)
                    || (i == newNumber && line != 1 && line != newNumber)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterE(int line) {
        /*
         * xxxxxx
         * x
         * xxxxxx
         * x
         * xxxxxx
         */

        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if (line == 1 || line == this.number1 || line == newNumber || i == 1) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterF(int line) {

        /*
         * xxxx
         * x
         * xxxx
         * x
         * x
         */

        int newNumber = 2 * this.number1 - 1;
        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1) || (line == 1) || (line == this.number1)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterG(int line) {
        /*
         * xxxxxxxxxx
         * x
         * x
         * x
         * x xxxxx
         * x x
         * xxxxxxxxx x
         */

        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((line == 1 && i != 1) || (line == newNumber && i != 1) || (i == 1 && line != 1 && line != newNumber) ||
                    (i == newNumber && line >= this.number1) || (line == this.number1 && i >= this.number1)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterH(int line) {
        /*
         * x x
         * x x
         * xxxxx
         * x x
         * x x
         */

        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1) || (i == newNumber) || (line == this.number1)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterI(int line) {
        /*
         * 1 x x
         * 2 x x
         * 3
         * 4 x x
         * 5 x x
         * 6 x x
         * 7 x x
         */

        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1 && line != 3) || (i == 2 && line != 3)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterJ(int line) {
        /*
         * x
         * x
         * x
         * x x
         * x x
         * xxxx
         * 
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1 && line != newNumber) || (line == newNumber && i != 1 && i != newNumber)
                    || ((line == newNumber - 1 || line == newNumber - 2 || line == newNumber - 3) && i == newNumber)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterK(int line) {

        /*
         * x x
         * x x
         * x x
         * xxxxx
         * x x
         * x x
         * x x
         * 
         * 
         */

        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if (i == 1 || (i == newNumber && line != this.number1)
                    || (line == this.number1 && (i != newNumber && i != newNumber - 1))) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterL(int line) {

        /*
         * x
         * x
         * x
         * xxxxx
         * 
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1) || (line == newNumber)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterM(int line) {

        /*
         * xxxx xxxx
         * x x x
         * x x x
         * x x x
         * x x
         * 
         * 
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1 && line != 1) || (line == 1 && (i != 1 && i != this.number1 && i != newNumber))
                    || (i == this.number1 && (line != 1 && line != newNumber)) || i == newNumber && line != 1) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterN(int line) {
        /*
         * x x x x
         * x x
         * x x
         * x x
         * x x
         * x x
         * x x
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if (i == 1 || (line == 1 && i != newNumber) || (i == newNumber && line != 1)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterO(int line) {
        /*
         * xxxxx
         * x x
         * x x
         * x x
         * xxxxx
         * 
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1 && (line != 1 && line != newNumber)) || (line == 1 && (i != 1 && i != newNumber))
                    || (line == newNumber && (i != 1 && i != newNumber))
                    || (i == newNumber && (line != 1 && line != newNumber))) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterOo(int line) {

        /*
         * x x
         * xxxxxx
         * x x
         * x x
         * xxxxxx
         * 
         */
        int ys = 2 * this.number1 - 1;

        for (int i = 1; i <= ys; i++) {
            if ((i == 1 && line != 2)
                    || (i == ys && (line != 2) || (line == 3) || (line == ys) || (i == ys && (line != 2)))) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterP(int line) {
        /*
         * xxxxxx
         * x x
         * x x
         * xxxxxx
         * x
         * x
         * x
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1 || (line == 1 && i != newNumber))
                    || (i == newNumber && (line != 1 && line != newNumber && line != newNumber - 1
                            && line != newNumber - 2 && line != newNumber - 3 && line != newNumber - 4))
                    || (line == this.number1 && i != newNumber)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterQ(int line) {
        /*
         * xxxxxx
         * x x
         * x x
         * xxxxxxx
         * x
         * x
         * x
         */

        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == newNumber && line != 1)
                    || (line == 1 && (i != 1 && i != newNumber)
                            || i == 1 && (line != 1 && line != this.number1 && line != newNumber
                                    && line != newNumber - 1 && line != newNumber - 2)
                            || line == this.number1 && i != 1)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterR(int line) {
        /*
         * xxxxx
         * x x
         * x x
         * xxxxx
         * x x
         * x x
         * x x
         * 
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1) || (line == this.number1 && (i != newNumber)) || (line == 1 && (i != newNumber))
                    || (i == newNumber && (line != 1 && line != this.number1))) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterS(int line) {

        /*
         * xxxxxx
         * x
         * x
         * xxxxxx
         * x
         * x
         * xxxxxx
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if (line == 1 || line == this.number1 || line == newNumber
                    || i == newNumber && (line != 2 && line != 3 && line != 4)
                    || i == 1 && (line == 2 || line == 3 || line == 4)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterT(int line) {

        /*
         * xxxxx
         * x
         * x
         * x
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((line == 1) || (i == this.number1)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterU(int line) {
        /*
         * x x
         * x x
         * x x
         * xxxxxx
         * 
         * 
         * 
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1) || (line == newNumber) || (i == newNumber)) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterV(int line) {
        /*
         * x x
         * x x
         * x x
         * x x
         * x x
         * x x
         * x
         * i*2-3=bosluk sayisi
         * 
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {

            if ((i == line && line <= this.number1) || (i == newNumber - line + 1 && line <= this.number1)) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterW(int line) {
        /*
         * x x x
         * x x x
         * x x x
         * x x x
         * xxxx xxxx
         * 
         */
        int newNumber = 2 * this.number1 - 1;

        for (int i = 1; i <= newNumber; i++) {
            if ((i == 1 && line != newNumber) || (line == newNumber && (i != 1 && i != this.number1 && i != newNumber))
                    || (i == this.number1 && line != newNumber) || i == newNumber && line != newNumber) {
                System.out.print("x");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void LetterY(int line) {

        int newNumber = 2 * this.number1 - 1;

        for (int j = 1; j <= newNumber; j++) {

            if ((line <= this.number1 && (j == line || j == newNumber - line + 1))
                    || (line > this.number1 && j == this.number1)) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
        }
    }

    private void LetterZ(int line) {
        int newNumber = 2 * this.number1 - 1;
        for (int j = 1; j <= newNumber; j++) {
            if (line == 1 || line == newNumber || j == newNumber - line + 1) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
        }

    }

    private void InsertSpace() {
        int newNumber = 2 * this.number1 - 1;
        for (int j = 1; j <= newNumber; j++) {
            System.out.print(" ");
        }
    }

}
