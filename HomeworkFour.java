/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkfour;
import java.util.*;

/**
 *
 * @author timon
 */
public class HomeworkFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double target;
        double current;
        System.out.print("Enter target price: ");
            target = scan.nextDouble();
        while(true) {
            System.out.print("Enter current price: ");
            current = scan.nextDouble();
            if(current >= target) {
                System.out.println("Stock price exceeds target price.");
            }
        }
    }
    
}
