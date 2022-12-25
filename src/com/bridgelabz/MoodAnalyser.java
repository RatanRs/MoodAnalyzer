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

	public String moodAnalyzer() {

		boolean status = message.toLowerCase().contains("sad");
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
       MoodAnalyser moodAnalyser = new MoodAnalyser(message);
		String result = moodAnalyser.moodAnalyzer();
		System.out.println(result);
	}
}