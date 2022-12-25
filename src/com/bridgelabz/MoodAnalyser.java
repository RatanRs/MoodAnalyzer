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
		if (message.equalsIgnoreCase("null")) {
			this.message = null;
		} 
		else {
			this.message = message;
		}
	}

	public void moodAnalysisException() {

		try {

			boolean status = message.contains("sad");
			if (status == true) {
				System.out.println("Sad");
			} else {
				System.out.println("Happy");
			}
		} catch (Exception exception) {
			System.out.println("Happy");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter message : ");
		String message = input.nextLine();
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
		moodAnalyser.moodAnalysisException();
	}
}