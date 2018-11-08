/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkthree;
import java.util.Scanner;


/**
 *
 * @author timon
 */
public class HomeworkThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double income;
        double tax = 0.0;
        String status;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Marital status: ");
            status = in.next();
        System.out.println("Enter Income: ");
            income = in.nextDouble();
            
        if(status.equals("single"))
        {
            if(income > 0 && income <= 8000)
                tax = .1*income;
            else if(income > 8000 && income <= 32000)
                tax = 800+(.15*income);
            else
                tax = 4400+(.25*income);
        }
        
        if(status.equals("Married"))
        {
            if(income > 0 && income <= 16000)
                tax = .10*income;
            else if(income > 16000 && income <= 64000)
                tax = 1600+(.15*income);
            else
                tax = 8800+(.25*income);
        }
        
        System.out.println("Your total tax is: " +tax);
            
        }
        
    }
