/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04a;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Lab04a {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
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
        key = Number.nextInt();
        
        int[] inputArray = new int[]{ num1,num2, num3, num4 }; 
        
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i] == key){
                return i;
                }
            }
        return-1;
            }
        }
    
    

