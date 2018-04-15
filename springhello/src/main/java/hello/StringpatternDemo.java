package hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringpatternDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int noOfIslands = Integer.parseInt(scan.nextLine().trim());
		//Long start = System.currentTimeMillis();
		int noOfIslandsCount = 1;
		Set<String> subStrings = new HashSet<String>();
		
		if(s.length()>=1 && s.length()<=100000 && noOfIslands>=1 && noOfIslands<=s.length()) {
			
			for (int i = 0; i < s.length(); i++) {

				for (int subStringLength = 1; subStringLength <= s.length() - i; subStringLength++) {

					
					String temp = s.substring(i, i + subStringLength);
					List<Integer> positionsList = new ArrayList<Integer>();

					for (int j = 0; j < s.length() - temp.length() + 1; j++) {

						if (s.substring(j, j + temp.length()).equals(temp)) {

							for (int k = j; k < j + temp.length(); k++) {
								positionsList.add(k);
							}
						}
					}

					for (int integer = 1; integer < positionsList.size(); integer++) {
						if (positionsList.get(integer) - positionsList.get(integer - 1) > 1) {
							noOfIslandsCount++;
						}

					}

					if (noOfIslandsCount == noOfIslands) {
						subStrings.add(temp);
					}
					noOfIslandsCount = 1;
				}
			}
		}
		System.out.println(subStrings.size());
		scan.close();
		//System.out.println(System.currentTimeMillis()-start);
	}
}
