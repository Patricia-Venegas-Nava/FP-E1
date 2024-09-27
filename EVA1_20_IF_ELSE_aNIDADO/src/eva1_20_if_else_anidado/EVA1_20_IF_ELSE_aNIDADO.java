/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_20_IF_ELSE_aNIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diaSeman;
        Scanner cap = new Scanner(System.in);
        System.out.println("CAPTURE UNDIA DEL 1 AL 7");
        diaSeman = cap.nextInt();
         cap.nextInt();
         
         if(diaSeman == 1){
              System.out.println("DOMINGO");
         }else if(diaSeman == 2){
              System.out.println("LUNES");
         }else if(diaSeman == 3){
              System.out.println("MARTES");
         }else if(diaSeman == 4){
              System.out.println("MIERCOLES");
         }else if(diaSeman == 5){
              System.out.println("JUEVES");
         }else if(diaSeman == 6){
              System.out.println("VIERNES");
         }else if(diaSeman == 7){
              System.out.println("SABADO");
         }else{
         
          System.out.println("NUMERO INCORRECTOO");
    }
    
    }
}
