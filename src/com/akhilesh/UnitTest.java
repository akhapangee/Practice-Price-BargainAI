/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh;

import java.util.Random;

/**
 *
 * @author Akhilesh
 */
public class UnitTest {

    public static void main(String[] args) {
        int[] nums = new int[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int min = 50, max = 100;
            int randomNumber = random.nextInt(max - min + 1) + min;
//            System.out.println(randomNumber);
            nums[i] = randomNumber;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("=======================================");
        double ma = 10;
        double mi = 15;
        
        
        for (int i = 0; i < 10; i++) {
             double val = Math.random();
        System.out.println(val);
        }

    }
}
