/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_14_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_14_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int cal;
        Scanner cap = new Scanner(System.in);
        cal = cap.nextInt();
        
        System.out.println("Cual es la calificacin");
        if(cal >= 70){
             System.out.println("NA");
        }else{
             System.out.println("ACREDITAS");
        }
    }
    
}
