package com.pb.YKostenko.hw9;

import java.util.Random;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class FileNumbers {
    public static void main(String[] args) throws Exception {
        createNumbersFile();
        createOddNumbersFile();
    }

    static void createNumbersFile() throws Exception {
        String str = "";
        Path testFile1 = Files.createFile(Paths.get("files\\numbers.txt"));
        Random random = new Random();
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("files\\numbers.txt"))) {
        for (int i=1; i<101; i++){
            str = str + (random.nextInt(99)+1) + " ";

           if (i%10 == 0){
                   writer.write(str);
                   writer.newLine();
               str = "";
            }
        }
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    static void createOddNumbersFile() throws Exception{
        String str = "";
        int count=1;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("files\\numbers.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                str = str + line;
            }

        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
        String [] subStr = str.split(" ");
        str = "";
        Path testFile1 = Files.createFile(Paths.get("files\\odd-numbers.txt"));
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("files\\odd-numbers.txt"))) {
            for (String str1 : subStr) {
                if (Integer.parseInt(str1) % 2 == 0) {
                    str = str + 0 + " ";
                } else {
                    str = str + str1 + " ";
                }
                if (count % 10 == 0) {
                    writer.write(str);
                    writer.newLine();
                    str = "";
                }
                count++;
            }
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
