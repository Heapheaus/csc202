package com.company;

import java.util.Scanner;

/**
 * Created by Heapheaus on 8/23/2017.
 */
public class Chapter18 {

    public static void main(String[] args){
        System.out.println("Please enter a string of characters containing both upper and lower cases.");
        Scanner Keyboard = new Scanner(System.in);
        String userInput = Keyboard.nextLine();
        System.out.println("There are: "+ caseCheck(userInput,0,0)+" upper case letters in this string.");


    }
    public static int caseCheck(String s, int x,int y) {
        if (x == s.length())
            return y;
        else {
            if (Character.isUpperCase(s.charAt(x))) {
                y++;
                return caseCheck(s, (x + 1), y);
            } else
                return caseCheck(s, (x + 1), y);

        }
    }

}

