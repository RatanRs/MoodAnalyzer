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
	String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    
    public void moodAnalysis() throws MoodAnalysisException{
       
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException("Enter proper message");
            } else {
                boolean status = message.toLowerCase().contains("sad");
                if (status == true) {
                    System.out.println("Sad");
                } else {
                    System.out.println("Happy");
                }
            }
        } catch (Exception exception) {
            System.out.println("Happy.." + exception);
        }
    }

    public static void main(String[] args) throws MoodAnalysisException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message : ");
        String message = input.nextLine();
       
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        moodAnalyser.moodAnalysis();
    }
}