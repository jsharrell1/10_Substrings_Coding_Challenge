package com.company;

import java.util.Scanner;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Tried to make the project more complicated at first by attempting
        // to create a small menu that gives the user the choice of inputting a string
        // of numbers or exiting the application. Ran into a couple of errors with
        // the syntax of using an arraylist to receive inputs from the user so I swapped
        // back to a basic array after the combination of that and the menu issues. I'd like
        // to come back to this and figure out how to execute the original plan I had for this.

        /*System.out.println("Choose from the following: ");
        System.out.println("1. Input Substring");
        System.out.println("2. Exit");*/



        Scanner keyboard = new Scanner(System.in);
        //int choice = keyboard.nextInt();
        //int[] numbers = {keyboard.nextLine()};

        //List<String> list = new ArrayList<String>();

        //list.add(keyboard.next());

        //array with the example set of numbers given in the word doc
        int[] numbers = {0,0,1,2,0,1,0};

        System.out.println("Substrings that equal 10 from array " + numbers + " within code");


        //for loop that runs through the number array set above
        for (int i = 0; i < numbers.length; i++) {
            //calls on the test(method that pulls the numbers from the array, the set sum we want to get to
            test(numbers, i, numbers[i], 10, String.valueOf(numbers[i]));
        }

    }


    //menu();

    // Switch case based menu to choose the option of inputting an array or exiting the application

        /*switch (choice) {

            case 1:
                test();
                break;


            case 2:
                System.exit(0);
                break;
        }


    }

// method to call on the sout statements for the menu

         */
   /* public static void menu() {

        System.out.println("Choose from the following: ");
        System.out.println("1. Input Substring");
        System.out.println("2. Exit");

    }*/

    // list of parameters within the method include the ints from the array
    // the int i that is used to run through the for loop, int sum which is the
    // sum of the numbers from the array, the int ten which is the perfect number
    // we want to hit, and a String for the substring which adds up to 10
    public static void test(int[] arr, int i, int sum, int ten, String substring) {
        for (int j = i + 1; j < arr.length; j++) {
            // if statement that print the combinations from the array that equal 10
            if (sum + arr[j] == ten) {
                System.out.println(substring + " " + String.valueOf(arr[j]));
            }
            // else statement for if the numbers from the array do not equal 10
            else {
                test(arr, j, sum+arr[j], ten, substring + " " + String.valueOf(arr[j]));
            }
        }







       /* int sum = 10;

// original logic i tried to use to figure out the substrings equalling to 10
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
