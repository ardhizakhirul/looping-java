/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet08;
import java.util.Scanner;
public class contoh02 {
    public static void main (String[]args){
        System.out.print("masukkan banyaknya output :") ;
        Scanner baca = new Scanner (System.in);
        
        int x;
        int n = baca.nextInt();
        for(x = 1; x <= n ; x++)
        {
            System.out.print(x + " Ardhi zakhirul ");
        }
        
        x = 1;
        while( x <= n)
        {
            System.out.println(x + " Ardhi Zakhirul Qolby"); 
            x++;
        }
        x = 1;
        do 
        {
            System.out.println( x + " Ardhi zakhirul Q.");
            x++;
        }
         while(x <= n);
    }
    
}
