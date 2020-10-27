package com.company;

import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Tried to make the project more complicated at first by attempting
        // to create a small menu that gives the user the choice of inputting a string
        // of numbers or exiting the application. Ran into a couple of errors with
        // the syntax of using an arraylist to receive inputs from the user so I swapped
        // back to a basic array after the combination of that and the menu issues. I'd like
        // to come back to this and figure out how to execute the original plan I had for this.

        menu();

    }


    public static void menu() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose from the following: ");
        System.out.println();
        System.out.println("1. Input Substring");
        System.out.println();
        System.out.println("2. Exit");
        System.out.println();


        int choice;

        choice = keyboard.nextInt();

        //while loop for menu that is set to not break until the user enters 2 to exit
        while (choice != 3) {

            switch (choice) {
                case 1:

                    System.out.println("Enter the length of the array: ");
                    System.out.println();

                    //sets up variable for taking in keyboard input from integers entered
                    int length = keyboard.nextInt();

                    //creates new array for numbers entered to be stored in
                    int[] newArray = new int[length];

                    System.out.println("Enter the elements of the array: ");
                    System.out.println();

                    //for loop that stores the numbers entered into the set length of the array, quits input
                    //once set length is reached
                    for (int i = 0; i < length; i++) {
                        newArray[i] = keyboard.nextInt();
                    }

                    //print statement that lists the users numbers entered
                    System.out.println(Arrays.toString(newArray));

                    //for loop for the substring of 10 algorithm
                    for (int i = 0; i < newArray.length; i++) {
                        //calls on the test(method that pulls the numbers from the array, the set sum we want to get to
                        test(newArray, i, newArray[i], 10, String.valueOf(newArray[i]));
                    }

                    //goes back to beginning of menu
                    menu();

                    break;

                //exit option
                case 2:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;

            }
        }

    }


    // list of parameters within the method include the ints from the array
    // the int i that is used to run through the for loop, int sum which is the
    // sum of the numbers from the array, the int ten which is the perfect number
    // we want to hit, and a String for the substring which adds up to 10
    public static void test(int[] arr, int i, int sum, int ten, String substring) {
        for (int j = i + 1; j < arr.length; j++) {
            // if statement that print the combinations from the array that equal 10
            //if the sum + ineger from "j" for loop equals ten it is marked as true
            if (sum + arr[j] == ten) {
                System.out.println(substring + " " + String.valueOf(arr[j]));
            }
            // else statement for if the numbers from the array do not equal 10
            else {
                test(arr, j, sum + arr[j], ten, substring + " " + String.valueOf(arr[j]));
            }
        }
    }
}
