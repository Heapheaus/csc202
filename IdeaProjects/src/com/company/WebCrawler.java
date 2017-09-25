package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = input.nextLine();
        crawler(url);
    }
    public static void crawler(String startingURL){
        HashSet listOfPendingURLs = new HashSet(10);
        HashSet listOfTranversedURLs = new HashSet(10);

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && listOfTranversedURLs.size()<=100){
            Object urlString = listOfPendingURLs.remove(0);
            if (!listOfTranversedURLs.contains(urlString)) {
                listOfTranversedURLs.add(urlString);
                System.out.println("Craw "+urlString);

                for (Object s: getSubURLs(urlString.toString())){
                    if(!listOfTranversedURLs.contains(s.toString())){
                        listOfPendingURLs.add(s.toString());
                    }
                }
            }
        }
    }
    public static HashSet getSubURLs(String urlString){
        HashSet list = new HashSet(10);
        //String s = ;
        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()){
                String line = input.nextLine();
                current = line.indexOf("Http:", current);
                while (current > 0){
                    int endIndex = line.indexOf("\"",current);
                    if(endIndex > 0){
                        list.add(line.substring(current, endIndex));
                    }
                    else{
                        current = -1;
                    }
                }
            }
        }
        catch (Exception ex){
            System.out.println("Error; "+ex.getMessage());
        }
        return list;
    }
}
