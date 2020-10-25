package com.company;

import java.util.Scanner;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*System.out.println("Choose from the following: ");
        System.out.println("1. Input Substring");
        System.out.println("2. Exit");*/

        System.out.println("Input Substring: ");


        Scanner keyboard = new Scanner(System.in);
        //int choice = keyboard.nextInt();
        //int[] numbers = {keyboard.nextLine()};

        //List<String> list = new ArrayList<String>();

        //list.add(keyboard.next());

        int[] numbers = {3,5,2,3,0,1,4};

        for (int i = 0; i < numbers.length; i++) {
            test(numbers, i, numbers[i], 10, String.valueOf(numbers[i]));
        }

    }


    //menu();

        /*switch (choice) {

            case 1:
                test();
                break;


            case 2:
                System.exit(0);
                break;
        }


    }

   /* public static void menu() {

        System.out.println("Choose from the following: ");
        System.out.println("1. Input Substring");
        System.out.println("2. Exit");

    }*/

    public static void test(int[] arr, int i, int sum, int ten, String substring) {
        for (int j = i + 1; j < arr.length; j++) {
            if (sum + arr[j] == ten) {
                System.out.println(substring + " " + String.valueOf(arr[j]));
            } else {
                test(arr, j, sum+arr[j], ten, substring + " " + String.valueOf(arr[j]));
            }
        }







       /* int sum = 10;


        for (int i = 0; i < input.length(); i++){
            for (int j = i + 1; j <= input.length(); j++){
                sum += input.length();
                if(sum == 10){
                    System.out.println("Substring " + input + " is equal to 10");
                }
                else{
                    System.out.println("Substring " + input + " is not equal to 10");
                }
            }
        }*/
    }
}
