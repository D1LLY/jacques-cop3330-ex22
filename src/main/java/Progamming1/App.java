/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

/*
Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.
Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
 */

package Progamming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        final int SIZE=3;
        int arr[]=new int[SIZE];

        System.out.print("Enter the first number: ");
        arr[0]=in.nextInt();

        System.out.print("Enter the second number: ");
        arr[1]=in.nextInt();

        System.out.print("Enter the third number: ");
        arr[2]=in.nextInt();

        if(arr[0]==arr[1]&&arr[0]==arr[2]){
            return;
        }

        int max=arr[0];
        for(int i=1;i<SIZE;i++){
            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println("The largest number is "+max+".");


    }
}
