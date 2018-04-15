package hello;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MNProblem {
	
    static int findPossibleSmallestNumberMatchingPattern(String pattern) {
    	int SmallestNumber = -1;
    	int[] smallestNumberarray = new int[pattern.length()+1];
    	String smallestNumberString = "";
    	
    	
    	if(pattern.length() <=8) {
    		
    		for(int i=0;i<pattern.length();i++) {
    			if(pattern.charAt(i)=='N') {
    				if(i==0) {
    					smallestNumberarray[i]=1;
    					smallestNumberarray[i+1]=2;
    				}else {
    					int temp = smallestNumberarray[i]+1;
    					while(isPresent(smallestNumberarray, temp) ) {
    						temp = temp+1;
    					}
    					smallestNumberarray[i+1]=temp;
    				}
    			}else if(pattern.charAt(i)=='M') {
    				if(i==0) {
    					smallestNumberarray[i]=2;
    					smallestNumberarray[i+1]=1;
    				}else {
    					int temp = smallestNumberarray[i]-1;
						while (isPresent(smallestNumberarray, temp)) {
							int temp0 = 0;
							int j = i;
							while (isPresent(smallestNumberarray, temp0)) {
								temp0 = smallestNumberarray[j] + 1;
								j--;
							}
							smallestNumberarray[j + 1] = temp0;
							temp0 = 0;
							temp = smallestNumberarray[i] - 1;
						}
    					smallestNumberarray[i+1]=temp;
    				}
    				
    			}else {
    				SmallestNumber=-1;
    				break;
    			}
    		}
    		
    		
			for (int i : smallestNumberarray) {
    			smallestNumberString = smallestNumberString + i;
    		}
    		SmallestNumber= Integer.parseInt(smallestNumberString);
    	}
    	
    	

    	return SmallestNumber;
    }




	private static boolean isPresent(int[] SmallestNumberarray, int temp) {
		boolean isPresent =false;
		for (int i : SmallestNumberarray) {
			if(i==temp) {
				isPresent =true;
			}
		}
		return isPresent;
	}



	    
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = "D:\\workspace\\springhello\\1.txt";
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
//        else {
//            bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        }

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
    