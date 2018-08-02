/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet08;
import java.util.Scanner;
public class contoh03 {
    public static void main (String[] args){
        //MENAMPILKAN 10 BILANGAN GANJIL PERTAMA
        int x = 1;
        
        for(x = 1; x  <= 20 ; x+=2)
        {
           System.out.print(x + " "); 
        }
        System.out.println();
        
        // menampilkan 10 bilangan genap pertama
        
       
        
        for(x = 2; x  <= 20 ; x+=2)
        {
           System.out.print(x + " "); 
        }
        System.out.println();
        //cara 2
        for(x = 1; x <= 20; x++)
        {
            if (x % 2 == 1)
            {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        //menampilkan bilangan genap 10 pertama
        for(x = 1; x <= 20; x++)
        {
            if(x%2 == 0)
            {
                System.out.print(x + " ") ;
            }
        }
    }
   
}
