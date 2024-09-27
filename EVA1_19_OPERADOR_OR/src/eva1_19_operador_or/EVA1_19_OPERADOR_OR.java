/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km, meses;
        Scanner cap = new Scanner(System.in);
        System.out.println("CAPTURE EL KILOMETRAJE");
        km = cap.nextInt();
         cap.nextInt();
         System.out.println("CAPTURE LOS MESES");
         meses = cap.nextInt();
         cap.nextInt();
         if(km >= 5000 || meses >= 6){
              System.out.println("CAMBIO DE ACEITE");
         }else{
          System.out.println("TODO BIEN CON EL VEHICULO");
         }
         
    }
    
}
