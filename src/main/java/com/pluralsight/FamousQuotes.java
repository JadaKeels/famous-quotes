package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean condition = false;
        String anotherQuote;

        String[] favoriteQuotes = {
                "Carpe Diem. - Horace",
                "Run the day or the day runs you. - Jim Rohn",
                "Life is a movie but there will never be a sequel. - Nicki Minaj",
                "Be thankful for what you have; you’ll end up having more. If you concentrate on what you don’t have, you will never, ever have enough. — Oprah Winfrey",
                "When you are grateful, fear disappears and abundance appears. — Anthony Robbins",
                "Life is 10% what happens to you and 90% how you react to it. — Charles R. Swindoll",
                "Focus on your strengths, not your weaknesses. Focus on your character, not your reputation. Focus on your blessings, not your misfortunes. — Roy T. Bennett",
                "You cannot have a positive life and a negative mind. — Joyce Meyer",
                "I, not events, have the power to make me happy or unhappy today. I can choose which it shall be. Yesterday is dead, tomorrow hasn't arrived yet. I have just one day, today, and I'm going to be happy in it. - Groucho Marx",
                "You don’t have to see the whole staircase, just take the first step. — Martin Luther King Jr.",
        };

        for (int i = 0; i < favoriteQuotes.length; i++) {
            System.out.println(favoriteQuotes[i]);
        }

        while(!condition){
            System.out.print("\nPlease choose a number between 1 and 10 to display that quote: ");
            int j = scan.nextInt();
            scan.nextLine();

            try {
                System.out.println(favoriteQuotes[j-1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: your entry was not between 1 and 10...");
                System.out.println("Exception message: " + e.getMessage());
            }

            System.out.print("View another quote (Y/N): ");
            anotherQuote = scan.nextLine();

            if(!anotherQuote.equalsIgnoreCase("Y")){
                condition = true;
            }
        }

    }
}