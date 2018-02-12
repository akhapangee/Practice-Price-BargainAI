package com.akhilesh;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Akhilesh
 */
public class Product {

    public static void main(String[] args) {
        double costPrice = 10000;
        int maxMargin = 100;
        int minMargin = 50;
        int meter = 2;
        double minSellPrice = costPrice + (costPrice * 50 / 100);
        double maxSellPrice = costPrice + (costPrice * 100 / 100);
        System.out.println(minSellPrice);

        while (true) {
            String menu = "Buy shoes only for Rs. " + (maxSellPrice)
                    + " !\nEnter how much you can pay:";
            double sellPrice = Double.parseDouble(JOptionPane.showInputDialog(menu));

            if (sellPrice <= minSellPrice) {
                JOptionPane.showMessageDialog(null, "It's original Cost Price! Not possible!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int[] nums = new int[3];

                for (int i = 0; i < 3; i++) {
//                    int min = minSellPrice, max = maxSellPrice;
//                    Random random = new Random();
//                    int randomNumber = random.nextDouble(max - min + 1) + min;
//                    nums[i] = randomNumber;
                }
                
              

            }

        }

    }

}
