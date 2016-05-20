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
public class RandomIntegers {
    public static void main(String[] args)
    {
        SecureRandom randomNumbers = new SecureRandom();
        
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;
        
        for (int counter = 1; counter <= 6000000; counter++)
        {
            int face = 1 + randomNumbers.nextInt(6);
            switch (face)
            {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }
        System.out.println("1s=" + frequency1);
        System.out.println("2s=" + frequency2);
        System.out.println("3s=" + frequency3);
        System.out.println("4s=" + frequency4);
        System.out.println("5s=" + frequency5);
        System.out.println("6s=" + frequency6);
        
    }
    
}
