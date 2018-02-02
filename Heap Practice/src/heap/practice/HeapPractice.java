/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap.practice;

import java.util.Scanner;

/**
 *
 * @author jt024
 */
public class HeapPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number = 5;
        int num[] = new int[number];
        

        for(int i = 0; i<number; i++) {
//            String n = input.toString();
            num[i] = input.nextInt();
        }
        
        
        
    }
    
}
