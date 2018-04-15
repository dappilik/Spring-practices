package hello;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	/*
     * Complete the function below.
     */
	static String findQualifiedNumbers(int[] numberArray) {

		String qualifiedNumbers = "";

		Arrays.sort(numberArray);

		for (int i : numberArray) {
			if (String.valueOf(i).contains("1") && String.valueOf(i).contains("2") && String.valueOf(i).contains("3")) {
				if (qualifiedNumbers.isEmpty()) {

					qualifiedNumbers = String.valueOf(i);
				} else {

					qualifiedNumbers = qualifiedNumbers + "," + String.valueOf(i);
				}
			}
		}

		return (qualifiedNumbers.isEmpty() ? "-1" : qualifiedNumbers);

	}
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String  fileName = "D:\\workspace\\springhello\\1.txt";
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String res;
        int numberArray_size = 0;
        numberArray_size = Integer.parseInt(in.nextLine().trim());

        int[] numberArray = new int[numberArray_size];
        for(int i = 0; i < numberArray_size; i++) {
            int numberArray_item;
            numberArray_item = Integer.parseInt(in.nextLine().trim());
            numberArray[i] = numberArray_item;
        }

        res = findQualifiedNumbers(numberArray);
        bw.write(res);
        bw.newLine();

        bw.close();
    }
}