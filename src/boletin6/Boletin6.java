
package boletin6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Boletin6 {

    
    public static void main(String[] args) {
        
        

        Conta conta1=new Conta();
        conta1.setNomeCliente("María García");
        conta1.setNumeroConta("00009871");
        conta1.setSaldo(18976);
        conta1.ingresar(1345);
        conta1.retirar(1000);
        conta1.transferencia(100,"00398678" );
        conta1.visualizar();
     
        
        
       
        
       
        
       
    }
        
        
    
    
}
