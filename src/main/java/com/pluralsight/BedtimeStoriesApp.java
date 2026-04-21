package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStoriesApp {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the filename what you want to read: ");
        String userInputFileName = input.nextLine();

        try {
            FileReader fileReader = new FileReader(userInputFileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while(line!= null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("The file could not be read. Please make sure the file is available and not locked and then try again.");
            e.printStackTrace();
        }
    }
}
