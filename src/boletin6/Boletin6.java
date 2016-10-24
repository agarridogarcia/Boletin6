
package boletin6;

import javax.swing.JOptionPane;

public class Boletin6 {

    
    public static void main(String[] args) {
        Conta conta1=new Conta();
        conta1.setNomeCliente("María Pérez");
        conta1.setNumeroConta("00009871");
        conta1.setSaldo(18976);
        conta1.ingresar(1345);
        conta1.retirar(1000);
        
        Conta conta2=new Conta();
        conta2.setNomeCliente("Manuel García");
        conta2.setNumeroConta("00398678");
        conta2.setSaldo(3567);
        conta2.ingresar(340);
        conta2.retirar(234);
        
        conta2.transferencia(100,"00398678" );
     
        
        
       
        
       
        
       
    }
        
        
    
    
}
