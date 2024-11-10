// Write a JAVAprogram to print all natural numbers in reverse (from n to 1). -     using while loop

import java.util.Scanner;

class Rnatural {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 1, n;

        System.out.println("Enter a Number:");
        n = sc.nextInt();

        System.out.println("The first " + n + " natural numbers are:");
        while (i <= n) {
            System.out.println(":"+i);
            i--;
        }
    }
}
