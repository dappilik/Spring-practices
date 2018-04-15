package hello;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeInEnglishWords {

	static String timeInWords(int h, int m) {

		String time = "";

		if (h >= 1 && h < 12 && m >= 0 && m < 60) {
			if (m == 0) {
				time = numNames[h] + " o' clock";
			} else if (m > 0 && m <= 30) {

				if (m == 15) {
					time = "quarter past " + numNames[h];
				} else if (m == 30) {
					time = "half past " + numNames[h];
				} else {
					if (m < 20) {
						if (m == 1) {
							time = numNames[m] + " minute past " + numNames[h];
						} else {

							time = numNames[m] + " minutes past " + numNames[h];
						}
					} else {
						time = tensNames[m / 10] + " " + numNames[m % 10] + " minutes past " + numNames[h];
					}
				}

			} else {

				if (m == 45) {
					time = "quarter to " + numNames[h + 1];
				} else {

					int remMinutes = 60 - m;

					if (remMinutes < 20) {
						if (remMinutes == 1) {
							time = numNames[remMinutes] + " minute to " + numNames[h + 1];
						} else {

							time = numNames[remMinutes] + " minutes to " + numNames[h + 1];
						}
					} else {
						time = tensNames[remMinutes / 10] + " " + numNames[remMinutes % 10] + " minutes to "
								+ numNames[h + 1];
					}

				}

			}
		}

		return time;
	}

	private static final String[] numNames = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	private static final String[] tensNames = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
			"eighty", "ninety" };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		String result = timeInWords(h, m);
		System.out.println(result);
		in.close();
	}
}