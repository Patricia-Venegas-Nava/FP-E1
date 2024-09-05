/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_12_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VELOCIDAD
        
        double vo, vf, d, a, t;
        
        //CREA EL SCANNER
        Scanner cap = new Scanner(System.in);
        
         System.out.println("Captura la velocidad inicial: ");
         vo = cap.nextDouble();
         System.out.println("Capture la Aceleración: ");
         a = cap.nextDouble();
         System.out.println("Captura el tiempo: ");
         t = cap.nextDouble();
        
         d = vo * t + (a * t * t)/2.0;
         
         System.out.println("Distancia = " + d);
         
        
    }
    
}
