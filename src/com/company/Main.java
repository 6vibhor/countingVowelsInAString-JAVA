package com.company;
import java.lang.String;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String input2 = input.nextLine();
        System.out.println(vowels(input2.toLowerCase()));
        String hello = "Hello";
        System.out.println(hello.length());
    }
    public static int vowels(String input) {
        int count = 0;
        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }


}
