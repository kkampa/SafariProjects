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
public class Incrementers {
    public static void main (String[] args)
    {
        int c = 5;
        System.out.printf("before:%d%n",c);
        System.out.printf("postincrement:%d%n",c++);
        System.out.printf("post:%d%n",c);
        
        System.out.println();
        
        System.out.printf("before:%d%n",c);
        System.out.printf("preincrement:%d%n",++c);
        System.out.printf("post:%d%n",c);
    }
}
