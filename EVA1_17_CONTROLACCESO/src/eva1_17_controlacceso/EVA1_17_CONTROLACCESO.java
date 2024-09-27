/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_controlacceso;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_17_CONTROLACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR VARIABLES Y CAPTURAR USUARIO
        String usu, pwd;
        Scanner cap = new Scanner(System.in);
        System.out.println("Usuario: ");
        usu = cap.nextLine();
        System.out.println("Password: ");
        pwd = cap.nextLine();
        
        if(usu.equals("Admin") && pwd.equals("1234")){
            System.out.println("ACCESO CONCEDIDO");
        }else{
              System.out.println("ACCESO DENEGADO");
        }
        
    }
    
}
