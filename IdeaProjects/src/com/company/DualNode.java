package com.company;
//Suppose we would like to create a data structure for holding numbers that
//        can be accessed either in the order that they were added or in sorted order.
//        We need nodes having two references. If you follow one trail of references,
//        you get the items in the order they were added. If you follow the other trail
//        of references, you get the items in numeric order. Create a class DualNode
//that would support such a data structure. Do not write the data structure
//        itself.

import java.util.Arrays;
import java.util.Scanner;

//I'm going to use an array for an example here the array can be replaced with any data structure the developer wants.
public class DualNode {
    public static void main(String[] args){
        int i = 0;
        System.out.println("Enter the amount of indexes for the test array.");
        Scanner keyboard = new Scanner(System.in);
        double tester[] = new double[i];
        double tester2[] = tester;

    }
    //adds a number to both structures
    public void addNumber(double x, double[] y,double[] z){
        int i=0;
        while(i<y.length){
            if(y[i]==0){
                y[i]=x;z[i]=x;}
             else{i++;}
        }
    }
    //this can be used for either structure.
    public double displayNumber(int i, double[] y){
        System.out.println("The Number is: "+y[i]);
        return y[i];
    }
    //makes sure your chickens are in the correct order. Or in my case squirrels.
    public void sortArray(double[] x){
        Arrays.sort(x);
    }
    public double findNumber(double i, double[] x){
        int c = 0;
        while(c<x.length){
            if (x[c]==i){
                System.out.println("Number found at: "+c);
                c++;}
            else{c++;}
        }
        return c;
    }
    //finds the first occasion of a number
    public double findFirstNumber(double i, double[] x){
        int c = 0;
        while(c<x.length){
            if (x[c]==i){
                System.out.println("Number found at: "+c);
                break;}
            else{c++;}
        }
        return c;
    }
    //prints array
    public double printArray(double[] x){
        int i =0;
        while(i<x.length){
            System.out.println(x[i]);
            i++;
        }
        return 0;
    }
    public double removeNumber(double[] x, double y){
        int i=0;
        while(i<x.length){
            if (x[i]==y){x[i]=0;}
            else{i++;}
        }
        return printArray(x);
    }

}
