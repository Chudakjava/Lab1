package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(text);
        System.out.println("\n\n" + formatText(text));
    }
    public static String formatText(String incomingText) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = incomingText.split(" ");
        for (int i = 0; i < strArr.length; i++) {

            if ((strArr[i].length() % 5 != 0) || isVowel(strArr[i])) {
                sb.append(strArr[i]).append(" ");
            }
        }
        String outText = sb.toString().trim();
        return outText;
    }
    public static boolean isVowel(String incomingText) {
        switch (incomingText.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
                return false;
        }
    }
}