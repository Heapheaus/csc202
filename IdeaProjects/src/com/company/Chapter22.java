package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Chapter22 {
    final static String file = "PrimeNumbers.dat";
    public static void main(String[] args){
        try{
            RandomAccessFile rand = new RandomAccessFile(file, "r");
            //455,052,511 prime numbers in this file. I want the last 100. they're stored as longs,
            // 1 long = 64 bits or 8 bytes. 8*455,052,511 = 3,640,420,088 bytes. The input on skip is an int,
            // so it caps at 2.1 billion
            rand.skipBytes(2000000000);
            rand.skipBytes(1640420088);
            String line;
            while (rand.readLine()!=null){
                line = rand.readLine();
                System.out.print(line);
            }
        }
        catch (IOException e){
            e.getStackTrace();
        }
    }
}
