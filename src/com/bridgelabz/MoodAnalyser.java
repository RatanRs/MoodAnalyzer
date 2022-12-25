package com.bridgelabz;

import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class MoodAnalyser {
	/***
	 * 
	 * @param args
	 */
	public String moodAnalyzer(String message) {
        /**
         * In this method return mood
         */
        boolean status = message.contains("sad");
        if (status == true) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message : ");
        String message = input.nextLine();
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.moodAnalyzer(message);
        System.out.println(result);
    }
}
