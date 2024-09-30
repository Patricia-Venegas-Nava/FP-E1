/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int year;
         Scanner cap= new Scanner (System.in);
         System.out.println("INGREE EL AÑO: ");
         year= cap.nextInt();
       
        if(year %4 == 0 && year % 100 != 0 || year % 400 == 0) {
            
            System.out.println( year + "SI ES AÑO BISIESTO");
            
        } else{
            
            System.out.println( year + "NO ES AÑO BISIESTO");
    }
    }
}
    

