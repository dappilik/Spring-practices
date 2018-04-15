package hello;

import java.util.Scanner;

public class DataTypeDemo {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        
        int integerVar;
        double doubleVar;
        String stringVar;
        

        integerVar= Integer.parseInt(scan.nextLine().trim());
        doubleVar=Double.parseDouble(scan.nextLine().trim());
        stringVar=scan.nextLine();
        
        System.out.println(i+integerVar);
        System.out.println(d+doubleVar);
        System.out.println(s+stringVar);
        
        scan.close();
    }
}