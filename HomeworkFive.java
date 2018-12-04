/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkfive;
import java.util.*;

/**
 *
 * @author timon
 */
public class HomeworkFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your household income: ");
        int income = in.nextInt();
            System.out.print("Please enter the number of children: ");
            int children = in.nextInt();
            
         /** return amount of assistance at end */
            
        int assistance = financialAssistance(income, children);
        System.out.printf("Amount of finance assistance: %d", assistance);
            
    }
    
    public static int financialAssistance(double income, int children) {
        if (income > 30000 && income < 40000 && children >= 3) {
            return children * 1000;      
        }
        else if (income > 20000 && income < 30000 && children >= 2) {
            return children * 1500;
        }
        else if (income < 20000) {
            return children * 2000;
        }
        else {
            return -1;
        }
    }
    
}
