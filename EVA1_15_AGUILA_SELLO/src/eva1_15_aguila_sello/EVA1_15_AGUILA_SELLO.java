/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_aguila_sello;

/**
 *
 * @author invitado
 */
public class EVA1_15_AGUILA_SELLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //0.0 -- 0.999999999999999999999999
        double valor = Math.random();
        if(valor < 0.5){
             System.out.println("AGUILA");
        }else{
             System.out.println("SELLO");
        }
    }
    
}
