/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkfourpart2;
import java.util.*;

/**
 *
 * @author timon
 */
public class HomeworkFourPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int occupants = 0;
            while(occupants < 100) {
                System.out.println("How many people are entering/leaving?: ");
                int num = in.nextInt();
                occupants += num;
                System.out.println("Occupants in bar: " + occupants);
                
            }
            
            System.out.println("Sorry bar is full");
        
    }
    
}
