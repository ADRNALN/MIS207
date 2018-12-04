/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworksix;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author timon
 */
public class HomeworkSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<Character> isPet = new ArrayList<Character>();

        boolean isPrice = true;
        while (isPrice) {
            System.out.println("Please enter an item: ");
            System.out.print("Cost: ");
            double price = in.nextDouble();

            if (price != -1) {
                prices.add(price);
                System.out.print("Is this a pet Y/N: ");
                char pet = in.next().charAt(0);
                isPet.add(pet);
            } else {
                isPrice = false;
                System.out.println("The End.");
            }
        }
/** Close previous begin discounts **/
            in.close();
            
            boolean[] allPets = new boolean[isPet.size()];
            for (int i = 0; i < isPet.size(); i++) {
                if (isPet.get(i) == 'Y') {
                    allPets[i] = true;
            } 
                    else if (isPet.get(i) == 'N') {
                    allPets[i] = false;
            }
        }
            double[] allPrices = new double[prices.size()];
            for (int i = 0; i < prices.size(); i++) {
                allPrices[i] = prices.get(i);
            }
            
/** calculate discount **/
        int times = allPrices.length;
        discount(allPrices, allPets, times);
    }

        public static void discount(double[] prices, boolean[] isPet, int nItems) {
            int totalPrice = 0;

            for (int i = 0; i < nItems; i++) {
                if (!isPet[i]) {
                    totalPrice += prices[i];
            }
        }

            System.out.printf("Your total discount is: %.2f", totalPrice * 0.2);
    }
}
