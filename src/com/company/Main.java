package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String myWord;
        int mixInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("This little program is a word mixer, you can enter a word of your choosing and mix it in 3 different ways...");
        System.out.println("Please enter your word and then press (ENTER): ");
        myWord = sc.next();
        System.out.println("Now select what you want to do with your word and press (ENTER): ");
        System.out.println("1. Switch the first and last letters of my word!");
        System.out.println("2. Cut my word in half and switch those halves around!");
        System.out.println("3. CAPITALISE the last three letters of my word!");
        mixInput = sc.nextInt();
        switch(mixInput) {
            case 1: myWord = Mixer.firstLast(myWord); System.out.println(myWord); break;
            case 2: myWord = Mixer.half(myWord); System.out.println(myWord); break;
            case 3: myWord = Mixer.capitalise(myWord); System.out.println(myWord); break;
            default: System.out.println("ERROR: Invalid Input! Exiting Program...");
        }
    }
}
