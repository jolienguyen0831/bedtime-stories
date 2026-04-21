package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStoriesApp {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("""
                1. Goldilocks
                2. Hansel_and_gretel
                3. Mary_had_a_little_lamb
                Please enter the filename what you want to read:""");
        int userChoice = input.nextInt();
        input.nextLine();
        String userInputFileName = "";
        int counter = 1;
        switch (userChoice){
            case 1 -> userInputFileName = "goldilocks.txt";
            case 2 -> userInputFileName = "hansel_and_gretel.txt";
            case 3 -> userInputFileName = "mary_had_a_little_lamb.txt";
        }

        try {

            FileReader fileReader = new FileReader(userInputFileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while(line!= null){
                System.out.printf("%d. %s%n",counter,line);
                line = bufferedReader.readLine();
                counter ++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("The file could not be read. Please make sure the file is available and not locked and then try again.");
            e.printStackTrace();
        }
    }
}
