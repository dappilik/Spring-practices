package hello;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NoOfChocolates {

	static int chocolateFeast(int n, int c, int m) {
		
		int totalChocolates = 0;
		if(n>=2 && n<=100000 && c>=1 && c<=n && m>=2 && m<=n) {
			
			totalChocolates = n / c;
			int wrappers = totalChocolates;
			while (wrappers >= m) {
				totalChocolates = totalChocolates + wrappers / m;
				if (wrappers % m != 0) {
					wrappers = wrappers / m + wrappers % m;
				} else {
					wrappers = wrappers / m;
				}
			}
		}

		return totalChocolates;

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
        in.close();
    }
}
