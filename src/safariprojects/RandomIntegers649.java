/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safariprojects;

import java.security.SecureRandom;
/**
 *
 * @author kurt.kampa
 */
public class RandomIntegers649 {
    public static void main(String[] args)
    {
        int[] tracker = new int[6];
        SecureRandom randomNumbers = new SecureRandom();
        for (int counter = 1; counter <= 6; counter++)
        {
            int face = 1 + randomNumbers.nextInt(49);
            if (checkLoop(tracker, face))
            {
                System.out.println(tracker[counter] + " = " + face);
                counter --;
            }
            else 
            {
                tracker[counter - 1] = face;
                System.out.printf("%d   ", face);

                if (counter % 5 == 0)
                    System.out.println();
            }
        }
    }
    
    public static boolean checkLoop(int[] intArray, int targetValue)
    {
        for (int value: intArray)
        {
            if (value == targetValue)
                return true;
        }
        return false;
    }
}
