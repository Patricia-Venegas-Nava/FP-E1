/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_18_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner cap = new Scanner(System.in);
        System.out.println("CAPTURE SU CALIFICAION");
        calif = cap.nextInt();
        
        if(calif >=0 && calif <= 100){
            System.out.println("CALIFICACION VALIDA");
        }else{
            System.out.println("CALIFICACION NO VALIDA");
        }
        
    }
    
}
