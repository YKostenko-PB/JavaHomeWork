package com.pb.YKostenko.hw4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalLetter {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter string:");
        String str = scan.nextLine();
        System.out.println (cLetter (str));
    }
    static String cLetter (String str){
        Matcher mth = Pattern.compile("^\\w|\\W\\w").matcher(str);
        while (mth.find()) {
            str = str.replaceFirst(mth.group(), mth.group().toUpperCase());
        }
        return str;
    }
}
