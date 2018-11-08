/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworktwo;

import java.util.Scanner;

/**
 *
 * @author timon
 */
public class HomeworkTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a phone number: ");
        String n = in.next();
        
        String areaCode = "(" + n.substring(0, 3) +")";
        String rightNumber = areaCode + n.substring(3,6) + "-" + n.substring(6);
        System.out.println("Formatted Number: " + rightNumber);
        
    }
    
}
