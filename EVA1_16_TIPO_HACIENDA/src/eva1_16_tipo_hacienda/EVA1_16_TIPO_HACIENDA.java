/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_16_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        Scanner cap = new Scanner(System.in);
         System.out.println("TIPO DE PERSONA F---> FISCAL, M---> MORAL");
         tipo = cap.nextLine().charAt(0);
         
         if(tipo == 'F'){
          System.out.println("PERSONA FISCAL");
         }else{
          System.out.println("PERSONA MORAL");
         }
         
    }
    
}
