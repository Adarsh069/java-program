//Write a JAVAprogram to input any alphabet and check whether it is vowel or    consonant.

import java.util.Scanner;

class Vowelcons {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character:");
        String character = sc.next().toUpperCase(); 
        if (character.equals("A") || character.equals("E") || character.equals("I") || character.equals("O") || character.equals("U")) {
            System.out.println("Given Character is a Vowel");
        } else {
            System.out.println("Given Character is a Consonant");
        }
    }
}
