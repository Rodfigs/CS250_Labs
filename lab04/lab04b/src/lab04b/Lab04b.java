/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04b;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Lab04b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Number = new Scanner(System.in);
        int size;
        int num1;
        int num2;
        int num3;
        int num4;
        int key;
        System.out.println("Please enter four numbers:");
        num1 = Number.nextInt();
        num2 = Number.nextInt();
        num3 = Number.nextInt();
        num4 = Number.nextInt();
         int[] inputArray = new int[]{ num1,num2, num3, num4 }; 
        
        int arraySize = inputArray.length;
       for (int i = 0; i < arraySize - 1; i++) {
           int index = i;
           for (int j = i + 1; j < arraySize; j++) {
               if (inputArray[j] < inputArray[index]){
               index = j;
               }
               }
               int temp = inputArray[i];
               inputArray[i] = inputArray[index];
               inputArray[index] = temp;
               }
           }
       }
   
    

