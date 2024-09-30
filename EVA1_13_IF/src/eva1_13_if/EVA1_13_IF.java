/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURA LA EDAD
        
        int edad;
        
       Scanner cap = new Scanner(System.in);
       
       System.out.println("CAPTURE SU EDAD");
       edad = cap.nextInt();
       
       //INSTRUCCION IF
       
      if(edad >= 18){
          System.out.println("ADULTO: mayor de edad");
      }
        else{
          System.out.println("MENOR de edad");
      }
       
       
    }
    
}
