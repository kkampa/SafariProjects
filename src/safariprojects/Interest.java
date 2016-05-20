/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safariprojects;

/**
 *
 * @author kurt.kampa
 */

import java.util.Scanner;

public class Interest {
    public static void main(String[] args)
    {
        double amount;
        double principalAmount;
        double addAmount;
        double principal;
        double rate;
        double payments;
        int year;
        int freqPerYear;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principal:");
        principal = input.nextDouble();
        System.out.println("Please enter the rate:");
        rate = input.nextDouble();
        System.out.println("Please enter the number of years:");
        year = input.nextInt();
        System.out.println("Please enter the contribution/month:");
        payments = input.nextDouble();
        System.out.println("Please enter the frequency per year:");
        freqPerYear = input.nextInt();
        
        System.out.printf("%s%20s%20s%20s%n","Year","Base Principal","Added Amount","Total Amount of Deposit");  
        
        for (int repeater = 1; repeater <= year; repeater++){
            addAmount = payments * (((Math.pow(1.0 + rate / 12, repeater * 12) - 1) / (rate / 12)));
            principalAmount = principal * Math.pow(1.0 + rate / freqPerYear, repeater * freqPerYear);
            amount = principalAmount + addAmount;
            System.out.printf("%4d%,20.2f%,20.2f%,20.2f%n",repeater,principalAmount,addAmount,amount);
        }
    }
    
    
    
}
