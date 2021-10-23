package com.pb.YKostenko.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main (String [] args) {
        System.out.println ("Enter string1:");
        String string1 = enterString();
        System.out.println ("Enter string2:");
        String string2 = enterString();
        System.out.println(isAnagram(string1, string2));
    }

    static String enterString (){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }
    static String streamLine (String str){
        char tempArray[] = str.replaceAll("\\W", "").toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    static String isAnagram (String str1, String str2){
        str1 = streamLine(str1);
        str2 = streamLine(str2);
        if(str1.equals(str2)){
            return new String("is anagram");
        }
        else {
            return new String("is not anagram");
        }

    }
}
