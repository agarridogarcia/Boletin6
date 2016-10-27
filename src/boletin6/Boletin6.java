
package boletin6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Boletin6 {

    
    public static void main(String[] args) {
        
        

        Conta conta1=new Conta();
        conta1.setNomeCliente("María García");
        conta1.setNumeroConta("00009871");
        conta1.setSaldo(18976);
        conta1.ingresar(conta1,1230);
        conta1.retirar(conta1,1000);
        
      
     
        Conta conta2=new Conta("aaaaa","111111",123);
        conta2.transferencia(11233, "00009871");
        
       
        
       
        
       
    }
        
        
    
    
}
