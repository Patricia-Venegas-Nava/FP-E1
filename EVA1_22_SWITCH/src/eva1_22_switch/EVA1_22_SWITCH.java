/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_22_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dias;
         Scanner cap = new Scanner(System.in);
         System.out.println("CAPTURE EL NUMERO DEL DIA DEL 1 AL 7");
         dias = cap.nextInt();
         cap.nextLine();
         
         switch(dias){
         case 1:
            System.out.println("LUNES"); 
             
         case 2:
             System.out.println("MARTES");
             break;
         case 3:
             System.out.println("MIERCOLES");
             break;    
        case 4:
             System.out.println("JUEVES");
             break;
         case 5:
             System.out.println("VIERNES");
             break;    
         case 6:
             System.out.println("SABADO");
             break;
         case 7:
             System.out.println("DOMINGO");
             break;  
        
         default:
             System.out.println("NO ES UN NUMERO VALIDO");
             
         }
    }
    
}
