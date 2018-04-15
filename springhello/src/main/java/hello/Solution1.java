package hello;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	
	/*
	 * Complete the function below.
	 */

//	static int[] oddNumbers(int l, int r) {
//		int size = 0;
//		if (l == r) {
//			if (l % 2 == 1) {
//				size = 1;
//			}
//		} else {
//
//			if (l % 2 == 1 && r % 2 == 1) {
//				size = 2 + (r - l - 1) / 2;
//			} else if (l % 2 == 1 || r % 2 == 1) {
//				size = 1 + (r - l) / 2;
//			} else {
//				size = (r - l) / 2;
//			}
//		}
//		int[] oddNumbers = new int[size];
//		int index = 0;
//		for (int i = l; i <= r; i++) {
//			if (i % 2 == 1) {
//				oddNumbers[index++] = i;
//			}
//		}
//
//		return oddNumbers;
//
//	}
	
	/*
     * Complete the function below.
     */
    static int findPossibleSmallestNumberMatchingPattern(String pattern) {
    	int SmallestNumber = -1;
    	int mCount =0;
    	int nCount =0;
    	String SmallestNumberString  ="";
    	
    	int[] SmallestNumberArray = new int[pattern.length()+1];
    	
    	for (char character : pattern.toCharArray()) {
			
			if(character=='M') {
				mCount++;
				SmallestNumber=0;
				
			}else if(character=='N') {
				nCount++;
				SmallestNumber=0;
			}else {
				SmallestNumber=-1;
				break;
			}
			
		}
    	
		if (pattern.length() <= 8 && SmallestNumber!=-1 ) {

			for (int i = 0; i < pattern.length(); i++) {
				
				if (pattern.charAt(i) == 'M') {

					if (SmallestNumberArray[i] == 0 && SmallestNumberArray[i + 1] == 0) {
						SmallestNumberArray[i] = 2;
						// SmallestNumberArray[i+1] = 1;

					} else if (i > 0 && SmallestNumberArray[i] != 0) {

						//SmallestNumberArray[i + 1] = SmallestNumberArray[i] - 1;
						int temp = SmallestNumberArray[i] - 1;;
						for(int j=i;j>=0;j--) {
							if(SmallestNumberArray[j]==temp) {
								
							}
						}

					}

				}else if (pattern.charAt(i) == 'N') {

					if (SmallestNumberArray[i] == 0 && SmallestNumberArray[i + 1] == 0) {
						SmallestNumberArray[i] = pattern.length();
						SmallestNumberArray[i+1] = pattern.length()+1;

					} else if (i > 0 && SmallestNumberArray[i] != 0) {
						SmallestNumberArray[i+1] = SmallestNumberArray[i] + 1;
						int temp =SmallestNumberArray[i+1];
						for(int j=i;j>=0;j--) {
								if(temp==SmallestNumberArray[j]) {
									temp=temp+1;
								}
							}
						SmallestNumberArray[i+1]=temp;

					}

				}
			}

			for (int i : SmallestNumberArray) {
				SmallestNumberString = SmallestNumberString + i;
			}
			SmallestNumber= Integer.parseInt(SmallestNumberString);
		}

    	return SmallestNumber;
    }


	private static int smallvalue(int[] SmallestNumberArray, int i, int temp) {
		
		for (int j = i; j >= 0; j--) {
			
			if (temp == SmallestNumberArray[j]) {
				temp = temp - 1;
			}
		}
		return temp;
	}

	    
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = "D:\\workspace\\springhello\\1.txt";
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        String pattern;
        try {
            pattern = in.nextLine();
        } catch (Exception e) {
            pattern = null;
        }

        res = findPossibleSmallestNumberMatchingPattern(pattern);
        bw.write(String.valueOf(res));
        bw.newLine();
        in.close();
        bw.close();
    }
}
    